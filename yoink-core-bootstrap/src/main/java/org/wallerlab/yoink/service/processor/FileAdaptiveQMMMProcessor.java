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
package org.wallerlab.yoink.service.processor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.service.bootstrap.JobBuilder;

import javax.xml.bind.JAXBElement;


/**
 * This class is to set up and execute adaptive QM/MM partitioning.
 * 
 * @author Min Zheng
 *
 */
@Service
public class FileAdaptiveQMMMProcessor extends AbstractAdaptiveQMMMProcessor<String, org.wallerlab.yoink.api.model.bootstrap.Job> {

	@Autowired
	@Qualifier("jobFileBuilderImpl")
	private JobBuilder<String,JAXBElement> jobFileBuilderImpl;

	protected static final Log log = LogFactory.getLog(FileAdaptiveQMMMProcessor.class);

	/**
	 * read in a list of requests and execute them.
	 * 
	 * @param input
	 *            - a list of files
	 * @return jobs - a list of YoinkJob
	 *         {@link org.wallerlab.yoink.api.model.bootstrap.Job}
	 */
	@Override
	public Job process(String input) throws Exception {
		return buildAndExecute(input);
	}

	protected Job buildAndExecute(String input) {
		Job job = jobFileBuilderImpl.build(input);
		job = executeQMMMPartitioning(job);
		return job;
	}

}
