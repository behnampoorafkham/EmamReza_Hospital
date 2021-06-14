package com.example.demo.model.persons;

import com.example.demo.model.Room;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Nurse {
    public Nurse() {
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

    public Nurse(Long id, String name, String age, Boolean sex, Double salary) {
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

    @Column(name = "sex")
    Boolean sex;

    @Column(name = "salary")
    Double salary;

    @ManyToMany
    List<Patient> patients = new ArrayList<>();

    @ManyToOne
    Room room;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
