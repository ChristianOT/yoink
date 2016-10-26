package org.wallerlab.yoink.service.jobbuilder

import org.wallerlab.yoink.api.model.bootstrap.Job
import org.wallerlab.yoink.api.service.molecular.FilesReader
import org.wallerlab.yoink.api.service.molecular.Translator
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem
import org.xml_cml.schema.Cml
import spock.lang.Specification

import javax.xml.bind.JAXBElement

/**
 * Created by christian on 20/10/2016.
 */
class JobMsBuilderImplSpec extends Specification {

    def "test building job from MS "() {

        def builder = new JobMsBuilderImpl()

        def msTranalator = Mock(Translator)
        def paramTranslator = Mock(Translator)
        FilesReader jaxbStringReader = Mock(FilesReader)

        def ms = Mock(SimpleMolecularSystem)
        def params = """<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cml xmlns="http://www.xml-cml.org/schema">
    <parameterList title="parameters">
        <parameter name="NUMBER_QM" value="8"/>
        <parameter name="NUMBER_BUFFER" value="5"/>
        <parameter name="DISTANCE_QM" value="5"/>
        <parameter name="DENSITY_ASR_QM" value="0.000001"/>
        <parameter name="DENSITY_DORI" value="0.0001"/>
        <parameter name="DENSITY_SEDD" value="0.1"/>
        <parameter name="SEDD" value="2"/>
        <parameter name="DORI" value="0.9"/>
        <parameter name="DENSITY_RATIO_MIN" value="0.064"/>
        <parameter name="DENSITY_RATIO_MAX" value="15.67"/>
        <parameter name="DENSITY_ASR_QMCORE" value="0.0001"/>
        <parameter name="DISTANCE_BUFFER" value="0.9"/>
        <parameter name="DENSITY_BUFFER" value="0.0000001"/>
        <parameter name="DENSITY_QM" value="0.001"/>
        <parameter name="REGION_CUBE" value="ADAPTIVE_SEARCH"/>
        <parameter name="SEDD_STEPSIZE" value="0.9 0.9 0.9"/>
        <parameter name="DORI_STEPSIZE" value="0.5 0.5 0.5"/>
        <parameter name="PARTITIONER" value="NUMBER"/>
        <parameter name="SMOOTHNER" value="DISTANCE_BUFFERED_FORCE"/>
        <parameter name="JOB_NAME" value="NUMBER_BUFFERED_FORCE"/>
        <parameter name="INPUT_FOLDER" value="./inputs"/>
        <parameter name="OUTPUT_FOLDER" value="./outputs"/>
    </parameterList>
</cml>"""

        builder.translatorFINAL=msTranalator
        builder.parameterTranslator=paramTranslator
        builder.jaxbStringReader=jaxbStringReader

        when:
        def job = builder.buildFromMS(ms,params)

        then:
        assert job instanceof Job
        1 * jaxbStringReader.read(_,_)
        1 * paramTranslator.translate(_)


    }
}
