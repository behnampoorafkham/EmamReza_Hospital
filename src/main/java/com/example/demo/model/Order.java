package com.example.demo.model;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import com.example.demo.model.persons.Patient;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    public Order() {
    }

    @Id
    int id;

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

    public Room getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Room room_id) {
        this.room_id = room_id;
    }

    public Patient getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Patient patient_id) {
        this.patient_id = patient_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
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

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Column(name = "number")
    int number;

    public Order(int id, int number, Room room_id, Patient patient_id, Category category_id, Doctor doctor_id, List<Nurse> nurses, List<Activity> activities, List<Medicine> medicines, Long sum) {
        this.id = id;
        this.number = number;
        this.room_id = room_id;
        this.patient_id = patient_id;
        this.category_id = category_id;
        this.doctor_id = doctor_id;
        this.nurses = nurses;
        this.activities = activities;
        this.medicines = medicines;
        this.sum = sum;
    }

    @OneToOne
    Room room_id;

    @OneToOne
    Patient patient_id;

    @OneToOne
    Category category_id;

    @OneToOne
    Doctor doctor_id;

    @OneToMany
    List<Nurse> nurses = new ArrayList<>();

    @OneToMany
    List<Activity> activities = new ArrayList<>();

    @OneToMany
    List<Medicine> medicines = new ArrayList<>();

    @Column(name = "sum")
    Long sum;
}
