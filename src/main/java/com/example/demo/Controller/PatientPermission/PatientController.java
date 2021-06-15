package com.example.demo.Controller.PatientPermission;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }
}
