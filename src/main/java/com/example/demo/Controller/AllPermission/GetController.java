package com.example.demo.Controller.AllPermission;

import com.example.demo.model.*;
import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import com.example.demo.model.persons.Patient;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/all")
public class GetController {

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

    @GetMapping("/get/activity/{id}")
    public Optional<Activity> findActivity(@PathVariable("id")Long id){
        return activityService.findActivity(id);
    }

    @GetMapping("/get/medicine/{id}")
    public Optional<Medicine> findMedicine(@PathVariable("id")Long id){
        return medicineService.findMedicine(id);
    }

    @GetMapping("/get/room/{id}")
    public Optional<Room> findRoom(@PathVariable("id")Long id){
        return roomService.findRoom(id);
    }

    @GetMapping("/get/doctor/{id}")
    public Optional<Doctor> findDoctor(@PathVariable("id")Long id){
        return doctorService.findDoctor(id);
    }

    @GetMapping("/get/nurse/{id}")
    public Optional<Nurse> findNurse(@PathVariable("id")Long id){
        return nurseService.findNurse(id);
    }

    @GetMapping("/get/patient/{id}")
    public Optional<Patient> findPatient(@PathVariable("id")Long id){
        return patientService.findPatient(id);
    }

    @GetMapping("/get/category/{id}")
    public Optional<Category> findCategory(@PathVariable("id")Long id){
        return categoryService.findCategory(id);
    }


}
