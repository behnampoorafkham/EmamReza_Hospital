package com.example.demo.model;

import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import com.example.demo.model.persons.Patient;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_hospital")
public class Order {

    public Order() {
    }

    @Id
    Long id;

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

    public Room getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Room room_id) {
        this.room_id = room_id;
    }

    public Patient getPatient_id() {
        return patient;
    }

    public void setPatient_id(Patient patient_id) {
        this.patient = patient_id;
    }

    public Category getCategory_id() {
        return category;
    }

    public void setCategory_id(Category category_id) {
        this.category = category_id;
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

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Activity activitie) {
        this.activities.add(activitie);
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicine) {
        this.medicines.add(medicine);
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Column(name = "number")
    int number;

    public Order(Long id, int number, Room room_id, Patient patient_id, Category category_id, Doctor doctor_id, List<Nurse> nurses, List<Activity> activities, List<Medicine> medicines, Double sum) {
        this.id = id;
        this.number = number;
        this.room_id = room_id;
        this.patient = patient_id;
        this.category = category_id;
        this.doctor = doctor_id;
        this.nurses = nurses;
        this.activities = activities;
        this.medicines = medicines;
        this.sum = sum;
    }

    @OneToOne
    Room room_id;

    @OneToOne
    Patient patient;

    @OneToOne
    Category category;

    @OneToOne
    Doctor doctor;

    @OneToMany
    List<Nurse> nurses = new ArrayList<>();

    @OneToMany
    List<Activity> activities = new ArrayList<>();

    @OneToMany
    List<Medicine> medicines = new ArrayList<>();

    @Column(name = "sum")
    Double sum;
}
