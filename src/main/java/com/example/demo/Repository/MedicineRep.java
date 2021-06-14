package com.example.demo.Repository;

import com.example.demo.model.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface MedicineRep extends CrudRepository<Medicine,Long> {
}
