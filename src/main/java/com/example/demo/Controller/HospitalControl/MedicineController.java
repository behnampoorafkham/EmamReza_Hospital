package com.example.demo.Controller.HospitalControl;

import com.example.demo.model.Medicine;
import com.example.demo.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @PostMapping("/add")
    public Medicine add(@RequestBody Medicine medicine){
        return medicineService.addMedicine(medicine);
    }

    @GetMapping("/get/{id}")
    public Optional<Medicine> find(@PathVariable("id")Long id){
        return medicineService.findMedicine(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        medicineService.deleteMedicine(id);
    }
}
