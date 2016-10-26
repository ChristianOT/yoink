package org.wallerlab.yoink.molecular.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

import java.util.List;

@Service
public interface MolecularSystemRepository extends MongoRepository<MolecularSystem, String> {

    List<MolecularSystem> findAll();
}
