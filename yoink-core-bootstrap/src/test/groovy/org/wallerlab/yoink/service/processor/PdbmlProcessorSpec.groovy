package org.wallerlab.yoink.service.processor

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.model.bootstrap.Job
import org.wallerlab.yoink.api.pdbml.IDatablockType
import org.wallerlab.yoink.api.service.adaptive.Smoothner
import org.wallerlab.yoink.api.service.bootstrap.JobBuilder
import org.wallerlab.yoink.api.service.bootstrap.Wrapper
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.api.service.regionizer.Regionizer
import org.wallerlab.yoink.api.service.regionizer.RegionizerMath
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem
import org.wallerlab.yoink.molecular.service.translator.TranslatorFINAL
import org.wallerlab.yoink.service.request.PdbmlFileReader
import spock.lang.Specification

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.namespace.QName

/**
 * Created by christian on 12/10/2016.
 */
class PdbmlProcessorSpec extends Specification {

    def "test processing JAXB<IDatablockType> to List<MolecularSystem>"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/wallerlab/yoink/resources/*.xml");
        def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v42.generated.DatablockType.class))
        def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v40.generated.DatablockType.class))

        def translator = new TranslatorFINAL()
        def myVector3D = new SimpleVector3DFactory()
        def myCoordFactory = new SimpleCoordFactory()
        def processor = new PdbmlProcessor()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        myCoordFactory.myVector3D = myVector3D
        translator.coordFactory = myCoordFactory
        processor.tf = translator

        then:
        processor.process(readerV40.read())
        processor.process(readerV42.read())

    }

}
