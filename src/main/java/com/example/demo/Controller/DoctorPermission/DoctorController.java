package com.example.demo.Controller.DoctorPermission;

import com.example.demo.model.persons.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctorService.updateDoctor(doctor);
    }

}
