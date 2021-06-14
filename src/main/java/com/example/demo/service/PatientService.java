package com.example.demo.service;

import com.example.demo.Repository.persons.PatientRep;
import com.example.demo.model.persons.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    PatientRep patientRep;

    public Patient addPatient(Patient patient){
        return patientRep.save(patient);
    }

    public void deletePatient(Long id){
        patientRep.deleteById(id);
    }

    public void findPatient(Long id){
        patientRep.findById(id);
    }

}