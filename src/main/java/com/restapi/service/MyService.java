package com.restapi.service;

import java.util.List;
import java.util.Optional;

import com.restapi.model.Patient;
//import com.restapi.model.PatientId;

public interface MyService {
    
    List<Patient> listAll();
    List<Patient> getByFnameAndLname(String name);
    //Patient saveOrUpdate(Patient patient);
    String delete(String pid);
    Optional<Patient> getByPid(String pid);
    String saveOrUpdate(String patientid);

}