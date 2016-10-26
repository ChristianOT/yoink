package org.wallerlab.yoink.service.request;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class DbReader implements ItemReader<List<MolecularSystem>> {

    //@Resource
   // MolecularSystemRepository molecularSystemRepository;

    @Override
    public List<MolecularSystem> read() throws Exception {
        List<MolecularSystem> mss = new ArrayList<>();

        try {
            System.out.println("Reading files from Database");
           // molecularSystemRepository.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem));
           // molecularSystemRepository = null;
            return mss;
        } catch (NullPointerException e) {
            System.out.println("Repository is set to null: " + e);
            return null;

        }

    }

    public List<MolecularSystem> readMsFromDb() throws Exception {
        List<MolecularSystem> mss = new ArrayList<>();
       // molecularSystemRepository.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem));
        return mss;
    }

}
