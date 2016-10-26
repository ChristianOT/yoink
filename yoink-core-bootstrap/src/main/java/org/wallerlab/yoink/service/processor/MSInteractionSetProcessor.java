package org.wallerlab.yoink.service.processor;//package org.gradle.forYoink.yoinkClasses;

import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.service.adaptiveProcessor.MSAdaptiveProcessor;
import org.wallerlab.yoink.api.service.regionizer.RegionizerMath;
import org.wallerlab.yoink.service.clustering.InteractionSet;
import org.wallerlab.yoink.service.jobbuilder.JobMsBuilderImpl;

import javax.annotation.Resource;
import java.util.Map;

public class MSInteractionSetProcessor implements MSAdaptiveProcessor{

	@Resource
    JobMsBuilderImpl builder;

	@Resource
	private InteractionSet interactionSet;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Override
	public Job process(MolecularSystem MS, String fileName) {
		Job job = builder.buildFromMS(MS, fileName);
		regionizerServiceStarting.regionize(job.getRegions(), job.getMolecularSystem());
		interactionSet.getDoriInteractionSet(job);
		return job;
	}

}
