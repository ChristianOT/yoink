/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wallerlab.yoink.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;
import org.wallerlab.yoink.api.service.adaptive.Smoothner;
import org.wallerlab.yoink.api.service.bootstrap.JobBuilder;
import org.wallerlab.yoink.api.service.bootstrap.Wrapper;
import org.wallerlab.yoink.api.service.regionizer.Partitioner;
import org.wallerlab.yoink.api.service.regionizer.Regionizer;
import org.wallerlab.yoink.api.service.regionizer.RegionizerMath;
import org.wallerlab.yoink.domain.AdaptiveQMMMJob;

/**
 * This class is to set up and execute adaptive QM/MM partitioning.
 * 
 * @author Min Zheng
 *
 */
@Service
public class AdaptiveQMMMProcessor implements
		ItemProcessor<List<File>, List<Job>> {

	@Autowired
	@Qualifier("jobBuilderImpl")
	private JobBuilder<JAXBElement> jobBuilder;

	@Resource
	private RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Resource
	private RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceEnding;

	@Resource
	private Smoothner adaptiveQMMMSmoothnerRouter;

	@Resource
	private Wrapper propertyWrapper;
	
	@Autowired 
	private List<Regionizer<Map<Name, Region>, Map<JobParameter, Object>>> adaptiveQMMMRegionizers;
	
	protected static final Log log = LogFactory
			.getLog(AdaptiveQMMMProcessor.class);

	/**
	 * read in a list of requests and execute them.
	 * 
	 * @param requests
	 *            - a list of files
	 * @return jobs - a list of YoinkJob
	 *         {@link org.wallerlab.yoink.api.model.bootstrap.Job}
	 */
	@Override
	public List<Job> process(List<File> requests) throws Exception {
		// Service based approach.
		List<Job> jobs = new ArrayList<Job>();
		if (requests.size() != 0) {
			jobs = execute(requests);
		}
		return jobs;
	}

	/**
	 * run batch adaptive qmmm partitioning
	 */
	private List<Job> execute(List<File> requests) {
		List<Job> jobs = new ArrayList<Job>();
		for (File file : requests) {
			log.info("execute:   " + file.getName());
			Job job = executeQMMMPartitioning(file);
			jobs.add(job);
			file.delete();
			log.info("finish  and delete  " + file.getName());
		}
		return jobs;
	}

	private Job executeQMMMPartitioning(File file) {
		Job job = jobBuilder.build(file.getAbsolutePath());
		regionize(job);
		smooth(job);
		wrapResult(job);
		return job;
	}

	private void regionize(Job job) {
		
		Map<Region.Name, Region> regions = job.getRegions();
		regionizerServiceStarting.regionize(regions, job.getMolecularSystem());
		regions = adaptiveQMMMRegionizers(job, regions);
		regionizerServiceEnding.regionize(regions, job.getMolecularSystem());
	}

	private Map<Region.Name, Region> adaptiveQMMMRegionizers(Job job,
			Map<Region.Name, Region> regions) {
		for (Regionizer<Map<Region.Name, Region>, Map<JobParameter, Object>> regionizer : adaptiveQMMMRegionizers) {
			regions = (Map<Region.Name, Region>) regionizer.regionize(regions,
					job.getParameters());
		}
		return regions;
	}

	private void smooth(Job job) {
		adaptiveQMMMSmoothnerRouter.smooth(job);
	}

	private void wrapResult(Job job) {
		propertyWrapper.wrap(job);
	}

}
