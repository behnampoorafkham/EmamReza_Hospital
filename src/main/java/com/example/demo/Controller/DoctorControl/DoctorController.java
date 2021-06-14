package com.example.demo.Controller.DoctorControl;

import com.example.demo.model.persons.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public Doctor add(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @GetMapping("/get/{id}")
    public Optional<Doctor> find(@PathVariable("id")Long id){
        return doctorService.findDoctor(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        doctorService.deleteDoctor(id);
    }
}
