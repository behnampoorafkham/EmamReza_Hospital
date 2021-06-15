package com.example.demo.service;

import com.example.demo.Repository.persons.PatientRep;
import com.example.demo.model.Activity;
import com.example.demo.model.persons.Patient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    PatientRep patientRep;

    public Patient addPatient(Patient patient){
        return patientRep.save(patient);
    }

    public Patient updatePatient(Patient patient){
        patientRep.deleteById(patient.getId());
        return patientRep.save(patient);
    }

    public void deletePatient(Long id){
        patientRep.deleteById(id);
    }

    public Optional<Patient> findPatient(Long id){
        return patientRep.findById(id);
    }

}