package com.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




//@Entity
//@Table(name = "patientid")
@Document(collection = "patientid")
public class PatientId {
    @Id
    private String pid;
    //private int age = 10;

    public PatientId(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
        
}
