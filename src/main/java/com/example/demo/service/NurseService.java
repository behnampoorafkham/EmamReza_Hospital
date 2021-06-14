package com.example.demo.service;

import com.example.demo.Repository.persons.NurseRep;
import com.example.demo.model.persons.Nurse;
import org.springframework.stereotype.Service;

@Service
public class  NurseService{

    NurseRep nurseRep;

    public Nurse addNurse(Nurse nurse){
        return nurseRep.save(nurse);
    }

    public void deleteNurse(Long id){
        nurseRep.deleteById(id);
    }

    public void findNurse(Long id){
        nurseRep.findById(id);
    }

}
