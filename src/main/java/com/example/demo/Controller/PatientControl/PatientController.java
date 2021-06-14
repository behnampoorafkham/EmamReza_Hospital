package com.example.demo.Controller.PatientControl;

import com.example.demo.model.persons.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public Patient add(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("/get/{id}")
    public Optional<Patient> find(@PathVariable("id")Long id){
        return patientService.findPatient(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        patientService.deletePatient(id);
    }
}
