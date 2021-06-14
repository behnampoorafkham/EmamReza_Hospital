package com.example.demo.Repository.persons;

import com.example.demo.model.persons.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRep extends CrudRepository<Patient,Long> {
}