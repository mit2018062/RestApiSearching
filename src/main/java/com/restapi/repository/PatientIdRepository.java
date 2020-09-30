package com.restapi.repository;

import com.restapi.model.PatientId;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface PatientIdRepository extends MongoRepository<PatientId, String>{
   // public storePid(Stirng pid)
    
}