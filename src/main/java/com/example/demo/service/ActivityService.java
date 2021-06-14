package com.example.demo.service;

import com.example.demo.Repository.ActivityRep;
import com.example.demo.model.Activity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActivityService {

    ActivityRep activityRep;

    public Activity addActivity(Activity activity){
        return activityRep.save(activity);
    }

    public void deleteActivity(Long id){
        activityRep.deleteById(id);
    }

    public Optional<Activity> findActivity(Long id){
       return activityRep.findById(id);
    }

}
