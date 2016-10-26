package org.wallerlab.yoink.api.service.bootstrap;


import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

public interface MSJobBuilder {

    Job buildFromMS(MolecularSystem MS, String parameters);
}
