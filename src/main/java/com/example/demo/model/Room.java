package com.example.demo.model;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Doctor getDoctor_id() {
        return doctor;
    }

    public void setDoctor_id(Doctor doctor_id) {
        this.doctor = doctor_id;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(Nurse nurse) {
        this.nurses.add(nurse);
    }

    public Room() {
    }

    public Room(Long id, int number, Doctor doctor_id, List<Nurse> nurses) {
        this.id = id;
        this.number = number;
        this.doctor = doctor_id;
        this.nurses = nurses;
    }

    @Id
    Long id;

    @Column(name = "number")
    int number;

    @ManyToOne
    Doctor doctor;

    @OneToMany
    List<Nurse> nurses = new ArrayList<>();
}
