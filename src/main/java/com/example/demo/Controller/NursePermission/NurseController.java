package com.example.demo.Controller.NursePermission;

import com.example.demo.model.persons.Nurse;
import com.example.demo.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    NurseService nurseService;

    public Nurse updateNurse(@RequestBody Nurse nurse){
        return nurseService.updateNurse(nurse);
    }
}
