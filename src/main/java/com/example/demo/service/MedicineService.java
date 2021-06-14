package com.example.demo.service;

import com.example.demo.Repository.CategoryRep;
import com.example.demo.Repository.MedicineRep;
import com.example.demo.model.Category;
import com.example.demo.model.Medicine;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    MedicineRep medicineRep;

    public Medicine addMedicine(Medicine medicine){
        return medicineRep.save(medicine);
    }

    public void deleteMedicine(Long id){
        medicineRep.deleteById(id);
    }

    public void findMedicine(Long id){
        medicineRep.findById(id);
    }

}
