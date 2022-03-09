package com.bank.repo;

import com.bank.model.NewAccountOpening;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewAccountOpeningRepo extends MongoRepository<String, NewAccountOpening> {

}
