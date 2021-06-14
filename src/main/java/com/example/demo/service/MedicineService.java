package com.example.demo.service;

import com.example.demo.Repository.MedicineRep;
import com.example.demo.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicineService {

    MedicineRep medicineRep;

    public Medicine addMedicine(Medicine medicine){
        return medicineRep.save(medicine);
    }

    public void deleteMedicine(Long id){
        medicineRep.deleteById(id);
    }

    public Optional<Medicine> findMedicine(Long id){
        return medicineRep.findById(id);
    }

}
