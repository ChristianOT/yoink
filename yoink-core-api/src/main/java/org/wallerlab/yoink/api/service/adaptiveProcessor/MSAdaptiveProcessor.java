package org.wallerlab.yoink.api.service.adaptiveProcessor;


import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

public interface MSAdaptiveProcessor {
	
	public Job process(MolecularSystem MS, String fileName);

}
