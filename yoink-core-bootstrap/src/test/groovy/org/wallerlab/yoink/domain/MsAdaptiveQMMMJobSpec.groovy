package org.wallerlab.yoink.domain

import org.wallerlab.yoink.api.model.molecular.MolecularSystem
import org.xml_cml.schema.Cml
import org.xml_cml.schema.ObjectFactory
import spock.lang.Specification

/**
 * Created by christian on 20/10/2016.
 */
class MsAdaptiveQMMMJobSpec extends Specification{

    def "test domain model "(){

        def ms=Mock(MolecularSystem)
        def parameters=Mock(Map)
        def properties=Mock(Map)
        def regions=Mock(Map)
        def job=new MSAdaptiveQMMMJob()
        def cml=Mock(Cml)
        def factory = new ObjectFactory()
        def input=factory.createCml(cml)

        when:
        job.setInput(input)
        job.setMolecularSystem(ms)
        job.setParameters(parameters)
        job.setProperties(properties)
        job.setRegions(regions)

        then:
        job.getInput()==input
        job.getMolecularSystem()==ms
        job.getParameters()==parameters
        job.getProperties()==properties
        job.getRegions()==regions
    }
}
