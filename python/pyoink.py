from jpype import *
import os
import sys
from numpy import *
import numpy as np

class PYoink(object):
    def __init__(self, yoink_jar_path, input_file,out_file="./result.xml",system=None):
	startJVM(getDefaultJVMPath(), "-Djava.class.path="+yoink_jar_path)
	Yoink=JClass("org.wallerlab.yoink.Yoink")
        yoink=Yoink()
        JavaApplicationContext=JClass("org.springframework.context.annotation.AnnotationConfigApplicationContext")
        javaApplicationContext=JavaApplicationContext()
        yoink.getBeans(javaApplicationContext)
        FileAdaptiveQMMMProcessor=JClass("org.wallerlab.yoink.service.processor.FileAdaptiveQMMMProcessor")
        self.adaptiveQMMM=javaApplicationContext.getBean(FileAdaptiveQMMMProcessor)
        JaxbFileReader=JClass("org.wallerlab.yoink.molecular.data.JaxbFileReader")
        jaxbFileReader=javaApplicationContext.getBean(JaxbFileReader)
        Cml=JClass("org.xml_cml.schema.Cml")
        self.jaxb_cml=jaxbFileReader.read(JString(input_file), Cml())
        JaxbFileWriter=JClass("org.wallerlab.yoink.molecular.data.JaxbFileWriter")
        self.jaxbFileWriter=javaApplicationContext.getBean(JaxbFileWriter)  
        self.result=None
        self.input_file=input_file   
	self.out_file=out_file
	self.atoms,self.molecules=self.get_atoms_molecules()
	self.system=system
	FileInteractionSetProcessor=JClass("org.wallerlab.yoink.service.processor.FileInteractionSetProcessor")
	self.interactionSetProcessor=javaApplicationContext.getBean(FileInteractionSetProcessor)
	FileClusteringProcessor=JClass("org.wallerlab.yoink.service.processor.FileClusteringProcessor")	
        self.clusteringProcessor=javaApplicationContext.getBean(FileClusteringProcessor)


    def partition(self):
        self.result=self.adaptiveQMMM.process(self.input_file)

    def get_interaction_list(self):
	result=self.interactionSetProcessor.process(self.input_file)
	interaction_temp= result.getInteractionList()
	interaction_list=[]
	weight_temp=result.getInteractionWeight()
	weight=[]
	#interaction_temp=java.util.ArrayList()
	#interaction_temp.addAll(interaction_set)
	for i in  range (interaction_temp.size()):
		temp=interaction_temp.get(i)	
                plist=[temp.get(0).intValue()-1,temp.get(1).intValue()-1]
                interaction_list.append(plist)
		temp=weight_temp.get(i).doubleValue()
		weight.append(temp)
	return interaction_list,weight	
  
    def get_clusters(self):
	return self.clusteringProcessor.process(self.input_file).getClusters()	
  	

    def get_qm_indices(self):
        Region=JClass("org.wallerlab.yoink.api.model.regionizer.Region")
        RegionName=JClass("org.wallerlab.yoink.api.model.regionizer.Region$Name")
        qm_atoms=self.result.getRegions().get(RegionName.valueOf("QM")).getAtoms()
        qm_indices=[]
        qm_size= qm_atoms.size()
        for i in range(qm_size):
            atom=qm_atoms.get(i)
            qm_indices.append(atom.getIndex())
        qm_indices=np.sort(qm_indices)
        return qm_indices
    	
    def write_result(self):
        self.jaxbFileWriter.write(JString(self.out_file),self.result.getInput().getValue())


    def update_input_file(self, positions=None,qm_core_fixed=None):  
        Double=JClass("java.lang.Double")
	if positions != None:
        	for iposition, position in enumerate(positions):
                	atom=self.atoms[iposition]
                	atom.setX3(Double(float(position[0])))
                	atom.setY3(Double(float(position[1])))
                	atom.setZ3(Double(float(position[2])))
	if qm_core_fixed != None:
		for m in self.molecules:
			m.setId(JString("MM"))
		for q in qm_core_fixed:
			self.molecules[q-1].setId(JString("QM_CORE_FIXED"))	
        self.jaxbFileWriter.write(JString(self.input_file),self.jaxb_cml.getValue())

    
    def get_atoms_molecules(self):
        MoleculeList=JClass("org.xml_cml.schema.MoleculeList")
        Molecule=JClass("org.xml_cml.schema.Molecule")
        AtomArray=JClass("org.xml_cml.schema.AtomArray")
        Atom=JClass("org.xml_cml.schema.Atom")
        cmlSystem=self.jaxb_cml.getValue().getAnyCmlOrAnyOrAny()
        atoms=[]
	molecules=[]
        for l in range(cmlSystem.size()):
          if (cmlSystem.get(l).getValue().getClass()==MoleculeList):
                moleculeList=cmlSystem.get(l).getValue().getAnyCmlOrAnyOrAny()
        	for i in range(moleculeList.size()):
          	  if(moleculeList.get(i).getValue().getClass()==Molecule):
		    molecules.append(moleculeList.get(i).getValue())	
                    molecule=moleculeList.get(i).getValue().getAnyCmlOrAnyOrAny()
                    for j in range(molecule.size()):                        
                        if(molecule.get(j).getValue().getClass()==AtomArray):
                          atomArray=molecule.get(j).getValue().getAnyCmlOrAnyOrAny()
                          for k in range(atomArray.size()):
                          	if (atomArray.get(k).getValue().getClass()==Atom):
                                  atom=atomArray.get(k).getValue()
                                  atoms.append(atom) 
        
	return atoms,molecules

    def update(self,qm_core_fixed=None):
	import os
        print "rerun yoink"
	if self.system!=None:
		self.update_input_file(self.system.get_positions(),qm_core_fixed)
	else:
		self.update_input_file(qm_core_fixed=qm_core_fixed)
 	self.partition()