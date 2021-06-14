package com.example.demo.model;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Doctor getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Doctor doctor_id) {
        this.doctor_id = doctor_id;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public Room() {
    }

    public Room(int id, int number, Doctor doctor_id, List<Nurse> nurses) {
        this.id = id;
        this.number = number;
        this.doctor_id = doctor_id;
        this.nurses = nurses;
    }

    @Id
    int id;

    @Column(name = "number")
    int number;

    @ManyToOne
    Doctor doctor_id;

    @OneToMany
    List<Nurse> nurses = new ArrayList<>();
}
