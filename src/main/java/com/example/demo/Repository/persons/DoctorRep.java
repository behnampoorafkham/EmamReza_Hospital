package com.example.demo.Repository.persons;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Patient;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRep extends CrudRepository<Doctor,Long> {
    Doctor findByName(String name);
}
