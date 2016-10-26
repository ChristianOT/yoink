package org.wallerlab.yoink.service.jobbuilder;

import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.pdbml.IDatablockType;
import org.wallerlab.yoink.api.service.bootstrap.MSJobBuilder;
import org.wallerlab.yoink.api.service.molecular.FilesReader;
import org.wallerlab.yoink.api.service.molecular.Translator;
import org.wallerlab.yoink.domain.AdaptiveQMMMJob;
import org.xml_cml.schema.Cml;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

@Service
public class JobMsBuilderImpl extends AbstractJobBuilder<String,JAXBElement> implements MSJobBuilder {

	@Resource
	public Translator<MolecularSystem,JAXBElement<IDatablockType>> translatorFINAL;

	@Resource 	//Use a string, not a file
	private FilesReader<Object, String> jaxbStringReader;


	@Override
	public Job buildFromMS(MolecularSystem MS, String parameters) {
        Job<JAXBElement> job = new AdaptiveQMMMJob();
		job.setMolecularSystem(MS);
		job.setParameters(parameterTranslator.translate(
				(JAXBElement<Cml>) jaxbStringReader.read(parameters, new Cml())));

		return job;
	}

	@Override
	public Job<JAXBElement> build(String input) {
		return null;
	}

	@Override
	public void readInMolecularSystem(Job<JAXBElement> job){
		MolecularSystem molecularSystem = translatorFINAL
				.translate(job.getInput());
		job.setMolecularSystem(molecularSystem);

	}


}
