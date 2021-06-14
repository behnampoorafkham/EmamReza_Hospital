package com.example.demo.service;

import com.example.demo.Repository.persons.NurseRep;
import com.example.demo.model.persons.Nurse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class  NurseService{

    NurseRep nurseRep;

    public Nurse addNurse(Nurse nurse){
        return nurseRep.save(nurse);
    }

    public void deleteNurse(Long id){
        nurseRep.deleteById(id);
    }

    public Optional<Nurse> findNurse(Long id){
       return nurseRep.findById(id);
    }

}
