package com.example.demo.Controller.MasterPermission;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class DeleteController {


    @Autowired
    ActivityService activityService;

    @Autowired
    MedicineService medicineService;

    @Autowired
    OrderService orderService;

    @Autowired
    RoomService roomService;

    @Autowired
    DoctorService doctorService;

    @Autowired
    NurseService nurseService;

    @Autowired
    PatientService patientService;

    @Autowired
    CategoryService categoryService;

    @DeleteMapping("/doctor/{id}")
    public void deleteDoctor(@PathVariable("id")long id){
        doctorService.deleteDoctor(id);
    }
    @DeleteMapping("/medicine/{id}")
    public void deleteMedicine(@PathVariable("id")long id){
        medicineService.deleteMedicine(id);
    }
    @DeleteMapping("/nurse/{id}")
    public void deleteNurse(@PathVariable("id")long id){
        nurseService.deleteNurse(id);
    }
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable("id")long id){
        categoryService.deleteCategory(id);
    }
    @DeleteMapping("/patient/{id}")
    public void deletePatient(@PathVariable("id")long id){
        patientService.deletePatient(id);
    }
    @DeleteMapping("/room/{id}")
    public void deleteRoom(@PathVariable("id")long id){
        roomService.deleteRoom(id);
    }
    @DeleteMapping("/activity/{id}")
    public void deleteActivity(@PathVariable("id")long id){
        activityService.deleteActivity(id);
    }
    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable("id")long id){
        orderService.deleteOrder(id);
    }
}
