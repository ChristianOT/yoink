package org.wallerlab.yoink.domain;


import org.springframework.stereotype.Component;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;
import org.xml_cml.schema.Cml;

import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class MSAdaptiveQMMMJob implements Job<JAXBElement> {


    private JAXBElement<Cml> input;

    private MolecularSystem molecularSystem;

    private Map<JobParameter, Object> parameters = new HashMap();

    private Map<String, Object> properties = new HashMap();

    private Map<Region.Name, Region> regions = new HashMap();
    private List<List<Integer>> interactionList;
    private List<Set<Integer>> clusters;
    private List<Double> interactionWeight;

    public MSAdaptiveQMMMJob() {
    }

    public MolecularSystem getMolecularSystem() {
        return this.molecularSystem;
    }

    public void setMolecularSystem(MolecularSystem molecularSystem) {
        this.molecularSystem = molecularSystem;
    }

    public Map<JobParameter, Object> getParameters() {
        return this.parameters;
    }

    public void setParameters(Map<JobParameter, Object> parameters) {
        this.parameters = parameters;
    }

    public Map<Name, Region> getRegions() {
        return this.regions;
    }

    public void setRegions(Map<Name, Region> regions) {
        this.regions = regions;
    }

    public JAXBElement<Cml> getInput() {
        return this.input;
    }

    public void setInput(JAXBElement input) {
        this.input = input;
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<List<Integer>> getInteractionList() {
        return this.interactionList;
    }

    public void SetInteractionList(List<List<Integer>> interactionSet) {
        this.interactionList = interactionSet;
    }

    public void setClusters(List<Set<Integer>> clusters) {
        this.clusters = clusters;
    }

    public List<Set<Integer>> getClusters() {
        return this.clusters;
    }

    public List<Double> getInteractionWeight() {
        return this.interactionWeight;
    }

    public void SetInteractionWeight(List<Double> interactionWeight) {
        this.interactionWeight = interactionWeight;
    }

}