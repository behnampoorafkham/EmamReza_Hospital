package com.example.demo.Controller.MasterPermission;


import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master")
public class CreateController {

    @Autowired
    ActivityService activityService;

    @Autowired
    MedicineService medicineService;

    @Autowired
    RoomService roomService;

    @Autowired
    CategoryService categoryService;

    @PostMapping("/add/category")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @PostMapping("/add/room")
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }
    @PostMapping("/add/medicine")
    public Medicine addMedicine(@RequestBody Medicine medicine){
        return medicineService.addMedicine(medicine);
    }

    @PostMapping("/add/activity")
    public Activity addActivity(@RequestBody Activity activity){
        return activityService.addActivity(activity);
    }
}
