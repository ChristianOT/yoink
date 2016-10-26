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
package org.wallerlab.yoink;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.wallerlab.yoink.adaptive.config.AdaptiveConfig;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.molecular.Molecule;
import org.wallerlab.yoink.density.config.DensityConfig;
import org.wallerlab.yoink.math.config.MathConfig;
import org.wallerlab.yoink.molecular.config.MolecularConfig;
import org.wallerlab.yoink.molecular.domain.*;
import org.wallerlab.yoink.molecular.repositories.MolecularSystemRepository;
//import org.wallerlab.yoink.molecular.repositories.StringRepo;
import org.wallerlab.yoink.regionizer.config.RegionizerConfig;
import org.wallerlab.yoink.config.BatchConfig;
import org.wallerlab.yoink.service.jobbuilder.*;

/**
 * This class is the main class of Yoink
 *
 * @author Min Zheng
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class Yoink /*implements CommandLineRunner */{
    /**
     * use Spring boot to start Yoink application
     *
     * @param args - an array of strings
     * @throws IOException          -{@link java.io.IOException}
     * @throws InterruptedException -{@link java.lang.InterruptedException}
     */

    public static void main(String[] args) throws IOException,
            InterruptedException {
        ApplicationContext ctx = SpringApplication.run(Yoink.class, args);
    }

    public AnnotationConfigApplicationContext getBeans(AnnotationConfigApplicationContext appContext) {
        ConfigurableEnvironment environment = new StandardEnvironment();
        try {
            environment.getPropertySources().addFirst(
                    new ResourcePropertySource("./application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        appContext.register(BatchConfig.class);
        appContext.setEnvironment(environment);
        appContext.refresh();

        return appContext;

    }

/*    @Autowired
    MolecularSystemRepository msr;

    @Override
    public void run(String... args) {
        System.out.println("Reading MolecularSystems from Database: ");
        System.out.println("Line 47 " + msr.findAll().get(0).getId());
        msr.findOne("5810cd19f8b8e405af52f050").getAtoms().forEach(Atom -> System.out.println(Atom.getCoordinate()));
//        MolecularSystem molecularSystem = msr.findOne("581090c4f8b8e45901bde2ff");
//        System.out.println(molecularSystem.getMolecules().get(0).getAtoms().get(0).toString());
        System.out.println(msr.findAll().size());

    }*/
}


