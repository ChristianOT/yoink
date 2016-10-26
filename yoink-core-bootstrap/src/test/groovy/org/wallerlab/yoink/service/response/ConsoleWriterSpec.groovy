package org.wallerlab.yoink.service.response

import spock.lang.Specification

/**
 * Created by christian on 12/10/2016.
 */
class ConsoleWriterSpec extends Specification{

    List<String> list = new ArrayList<String>()
    ArrayList lust = new ArrayList<List<String>>()

    def "test"() {
        def writer = new ConsoleWriter()
        when:
        list.add("hello")
        list.add("world")
        lust.add(list)
        then:
        writer.write(lust)
    }

    def "test consoleWriterForYoink"(){
        def writer = new ConsoleWriter()
        when:
        list.add("hello")
        list.add("world")
        lust.add(list)
        then:
        writer.write(lust)
    }
}
