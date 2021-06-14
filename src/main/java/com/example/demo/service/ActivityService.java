package com.example.demo.service;

import com.example.demo.Repository.ActivityRep;
import com.example.demo.model.Activity;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    ActivityRep activityRep;

    public Activity addActivity(Activity activity){
        return activityRep.save(activity);
    }

    public void deleteActivity(Long id){
        activityRep.deleteById(id);
    }

    public void findActivity(Long id){
        activityRep.findById(id);
    }

}
