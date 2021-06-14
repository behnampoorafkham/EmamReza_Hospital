package com.example.demo.Controller.NurseControl;

import com.example.demo.model.persons.Nurse;
import com.example.demo.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    NurseService nurseService;

    @PostMapping("/add")
    public Nurse add(@RequestBody Nurse nurse){
        return nurseService.addNurse(nurse);
    }

    @GetMapping("/get/{id}")
    public Optional<Nurse> find(@PathVariable("id")Long id){
        return nurseService.findNurse(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        nurseService.deleteNurse(id);
    }
}
