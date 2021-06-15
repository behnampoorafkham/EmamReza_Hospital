package com.example.demo.Controller.AllPermission;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import com.example.demo.model.persons.Patient;
import com.example.demo.service.DoctorService;
import com.example.demo.service.NurseService;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class PostController {

    @Autowired
    DoctorService doctorService;

    @Autowired
    PatientService patientService;

    @Autowired
    NurseService nurseService;

    @PostMapping("/add/doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @PostMapping("/add/nurse")
    public Nurse addNurse(@RequestBody Nurse nurse){ return nurseService.addNurse(nurse); }

    @PostMapping("/add/patient")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
}
