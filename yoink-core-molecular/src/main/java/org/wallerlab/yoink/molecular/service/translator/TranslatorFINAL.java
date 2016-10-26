package org.wallerlab.yoink.molecular.service.translator;

import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.*;
import org.wallerlab.yoink.api.pdbml.IAtomSite;
import org.wallerlab.yoink.api.pdbml.ICartn;
import org.wallerlab.yoink.api.pdbml.IDatablockType;
import org.wallerlab.yoink.api.service.Factory;
import org.wallerlab.yoink.api.service.molecular.Translator;
import org.wallerlab.yoink.molecular.domain.PdbAtom;
import org.wallerlab.yoink.molecular.domain.SimpleAtom;
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem;
import org.wallerlab.yoink.molecular.domain.SimpleMolecule;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 11/10/2016.
 */
@Service
public class TranslatorFINAL implements Translator<MolecularSystem, JAXBElement<IDatablockType>> {

    @Resource
    public Factory<Coord, double[]> coordFactory;

    private int moleculeCounter = 1;

    @Override
    public MolecularSystem translate(JAXBElement<IDatablockType> items) {
        return new SimpleMolecularSystem(items.getValue().getDatablockName(), translateToMolecule(items.getValue()));
    }


    public List<Molecule> translateToMolecule(IDatablockType item) {
        List<Atom> atoms = translateToAtom(item);
        List<Molecule> molecules = new ArrayList<Molecule>();
        int j = 0;
        for (int i = 0; i < atoms.size(); i++) {
            List<Atom> atomList = new ArrayList<>();
            while (atoms.get(j).getSeqId() == atoms.get(i).getSeqId()) {
                atomList.add(atoms.get(j));
                j++;
                if (j > atoms.size() - 1) {
                    break;
                }
            }
            i = j - 1;
            molecules.add(new SimpleMolecule(moleculeCounter, atomList));
            moleculeCounter++;
        }
        System.out.println("Number of Molecules: " + moleculeCounter);
        return molecules;
    }


    public List<Atom> translateToAtom(IDatablockType iDatablockType) {
        List<Atom> atoms = new ArrayList<>();
        List properties;
        System.out.println("number of Atoms: " + iDatablockType.getAtomSiteCategory().getAtomSite().size());
        int nAtoms = iDatablockType.getAtomSiteCategory().getAtomSite().size();

        for (int i = 0; i < nAtoms; i++) {
            properties = getProperties(iDatablockType, i);
            Atom atom = new SimpleAtom(
                    Integer.parseInt(properties.get(0).toString()),
                    Element.valueOf(properties.get(1).toString()),
                    coordFactory.create((double[]) properties.get(2)),
                    (int) properties.get(3));
            atoms.add(atom);
        }
        return atoms;
    }

    /*
     * Instead of return List , perhaps Map<index,List>()
     */
    public List getProperties(IDatablockType iDatablockType, Integer i) {
        List properties = new ArrayList();
        IAtomSite atom = (IAtomSite) iDatablockType.getAtomSiteCategory().getAtomSite().get(i);
        double cx = ((ICartn) atom.getCartnX().getValue()).getValue().doubleValue();
        double cy = ((ICartn) atom.getCartnY().getValue()).getValue().doubleValue();
        double cz = ((ICartn) atom.getCartnZ().getValue()).getValue().doubleValue();
        double[] coords = {cx, cy, cz};
        String element = atom.getTypeSymbol();
        String index = atom.getId();
        int seqId = Integer.parseInt((String) atom.getAuthSeqId().getValue());
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);
        properties.add(3, seqId);
        return properties;
    }

}
