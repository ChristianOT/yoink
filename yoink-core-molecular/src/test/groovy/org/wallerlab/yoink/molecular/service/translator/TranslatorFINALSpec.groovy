package org.wallerlab.yoink.molecular.service.translator

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.model.molecular.Atom
import org.wallerlab.yoink.api.model.molecular.MolecularSystem
import org.wallerlab.yoink.api.model.molecular.Molecule
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import org.wallerlab.yoink.service.request.PdbmlFileReader
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 12/10/2016.
 */
class TranslatorFINALSpec extends Specification{

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:/Users/christian/IdeaProjects/yoink/inputs/pdbml/*.xml");
    def readerV42 = new PdbmlFileReader(resources[1]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[3]/* Version 40: 5A0C */, JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v40.generated.DatablockType.class))

    def translator = new TranslatorFINAL()
    def myVector3D = new SimpleVector3DFactory()
    def coordFactory = new SimpleCoordFactory()

    int i = 0

    def "test getProperties"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory
        def properties1 = translator.getProperties(readerV40.read().getValue(), i)
        def properties2 = translator.getProperties(readerV42.read().getValue(), i)

        then:
        properties1.get(0) instanceof String
        properties1.get(1) instanceof String
        properties1.get(2) instanceof double[]
        properties1.get(3) instanceof Integer
        properties2.get(0) instanceof String
        properties2.get(1) instanceof String
        properties2.get(2) instanceof double[]
        properties2.get(3) instanceof Integer


    }

    def "test translateToAtom"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory

        then:
        assert translator.translateToAtom(readerV40.read().getValue()) instanceof List<Atom>
        assert translator.translateToAtom(readerV42.read().getValue()) instanceof List<Atom>
    }

    def "test translateToMolecule"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory

        then:
        assert translator.translateToMolecule(readerV40.read().getValue()) instanceof List<Molecule>
        assert translator.translateToMolecule(readerV42.read().getValue()) instanceof List<Molecule>
    }

    def "test translate"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory

        then:
        assert translator.translate(readerV40.read()) instanceof MolecularSystem
        assert translator.translate(readerV42.read()) instanceof MolecularSystem
    }

}
