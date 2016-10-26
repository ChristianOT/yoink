package org.wallerlab.yoink.service.processor

import spock.lang.Specification

/**
 * Created by christian on 20/10/2016.
 */
class DbProcessorSpec extends Specification {

    def "testing method process"() {

        def processor = new DbProcessor()
        def items = Mock(List)

        expect:
        processor.process(items) instanceof List<String>

    }

}
