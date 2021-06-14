package com.example.demo.Controller.HospitalControl;


import com.example.demo.model.Activity;
import com.example.demo.model.persons.Nurse;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @PostMapping("/add")
    public Activity add(@RequestBody Activity activity){
        return activityService.addActivity(activity);
    }

    @GetMapping("/get/{id}")
    public Optional<Activity> find(@PathVariable("id")Long id){
        return activityService.findActivity(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        activityService.deleteActivity(id);
    }
}
