package com.restapi.repository;

import com.restapi.model.PatientId;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
public interface PatientIdRepository extends CrudRepository<PatientId, String>{
   // public storePid(Stirng pid)
    
}
