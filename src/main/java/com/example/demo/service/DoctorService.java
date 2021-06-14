package com.example.demo.service;

import com.example.demo.Repository.persons.DoctorRep;
import com.example.demo.Repository.persons.NurseRep;
import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void findDoctor(Long id){
        doctorRep.findById(id);
    }

}

