package org.wallerlab.yoink.service.request

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.pdbml.v40.generated.DatablockType
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 12/10/2016.
 */
class PdbmlFileReaderSpec extends Specification{

    def "testing constructor"() {
        when:
        def reader1 = new PdbmlFileReader()
        def reader2 = new PdbmlFileReader(JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v40.generated.DatablockType.class))

        then:
        reader1.resource == null
        reader1.jaxbContext == null

        reader2.resource == null
        reader2.jaxbContext != null

    }


    def "testing read v40 PdbmlFiles"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:/Users/christian/IdeaProjects/yoink/yoink-core-bootstrap/src/test/groovy/org/wallerlab/yoink/resources/5a0c.xml");

        when:
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v40.generated.DatablockType.class))

        then:
        reader.read()

    }

    def "testing read v42 PdbmlFiles"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:/Users/christian/IdeaProjects/yoink/yoink-core-bootstrap/src/test/groovy/org/wallerlab/yoink/resources/4y1g.xml");

        when:
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.wallerlab.yoink.pdbml.v42.generated.DatablockType.class))

        then:
        reader.read()

    }
}
