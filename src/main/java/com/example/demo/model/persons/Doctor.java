package com.example.demo.model.persons;

import com.example.demo.model.Category;
import com.example.demo.model.Room;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctor {
    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Doctor(Long id, String name, String age, Boolean sex, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    @Id
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    String age;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Patient patient) {
        this.patients.add(patient);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Room room) {
        this.rooms.add(room);
    }

    public Category getCategory_id() {
        return category;
    }

    public void setCategory_id(Category category_id) {
        this.category = category_id;
    }

    @Column(name = "sex")
    Boolean sex;

    @Column(name = "salary")
    Double salary;

    @OneToMany
    List<Patient> patients = new ArrayList<>();

    @OneToMany
    List<Room> rooms = new ArrayList<>();

    @OneToOne
    Category category;
}
