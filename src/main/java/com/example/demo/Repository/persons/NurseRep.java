package com.example.demo.Repository.persons;

import com.example.demo.model.persons.Nurse;
import org.springframework.data.repository.CrudRepository;

public interface NurseRep extends CrudRepository<Nurse,Long> {
}
