package org.wallerlab.yoink.service.response;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.*;
import org.wallerlab.yoink.molecular.domain.*;
import org.wallerlab.yoink.molecular.repositories.MolecularSystemRepository;
//import org.wallerlab.yoink.molecular.repositories.StringRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Expects a List<> but gets Set<> from Translator !!!
 * <p>
 * Created by christian on 05/10/2016.
 */
@Service
public class DatabaseWriter implements ItemWriter<MolecularSystem> {

    @Autowired
    MolecularSystemRepository msr;

    @Override
    public void write(List<? extends MolecularSystem> item) throws Exception {

        for (MolecularSystem ms : item) {
            System.out.println("\nNumber of MS in Repository; " + msr.count());
            System.out.println("Saving MS: " + msr.save((SimpleMolecularSystem) ms));
        }
        System.out.println("Number of MS in Repository: " + msr.count() + "\n");

    }

}
