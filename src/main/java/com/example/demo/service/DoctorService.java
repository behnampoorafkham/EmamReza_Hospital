package com.example.demo.service;

import com.example.demo.Repository.persons.DoctorRep;
import com.example.demo.model.persons.Doctor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {

    DoctorRep doctorRep;

    public Doctor addDoctor(Doctor doctor){
        doctor.setSalary(0.0);
        return doctorRep.save(doctor);
    }

    public void deleteDoctor(Long id){
        doctorRep.deleteById(id);
    }

    public Optional<Doctor> findDoctor(Long id){
       return doctorRep.findById(id);
    }

}

