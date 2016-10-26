package org.wallerlab.yoink.service.response

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.molecular.repositories.MolecularSystemRepository
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem
import org.wallerlab.yoink.molecular.service.translator.TranslatorFINAL
import org.wallerlab.yoink.service.request.PdbmlFileReader
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 12/10/2016.
 */
class DatabaseWriterSpec extends Specification {

    def writer = new DatabaseWriter()
    def repo = Mock(MolecularSystemRepository)
    def ms1 = Mock(SimpleMolecularSystem)

    def translator = new TranslatorFINAL()
    def coordFactory = new SimpleCoordFactory()
    def vectorFactory = new SimpleVector3DFactory()


    def "test writing molecularSystem to db with TranslatorFinal"() {

        when:
        vectorFactory.myVectorType=Vector.Vector3DType.COMMONS
        coordFactory.myVector3D=vectorFactory
        translator.coordFactory=coordFactory
        writer.msr = repo
        writer.write([ms1])

        then:
        1 * repo.save(ms1)

    }


    def "test reading from database"() {

        when:
        vectorFactory.myVectorType=Vector.Vector3DType.COMMONS
        coordFactory.myVector3D=vectorFactory
        translator.coordFactory=coordFactory
        writer.msr = repo

        then:
        writer.getMolecularSystems(["null"])



    }


}
