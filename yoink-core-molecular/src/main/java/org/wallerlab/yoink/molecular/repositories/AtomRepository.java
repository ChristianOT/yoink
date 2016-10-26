package org.wallerlab.yoink.molecular.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Atom;

@Service
public interface AtomRepository extends MongoRepository<Atom, Long> {

}
