package com.example.demo.model.persons;

import com.example.demo.model.Category;
import com.example.demo.model.Medicine;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient {
    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(Nurse nurse) {
        this.nurses.add(nurse);
    }

    public Category getCategory_id() {
        return category;
    }

    public void setCategory_id(Category category_id) {
        this.category = category_id;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicine) {
        this.medicines.add(medicine);
    }

    public Doctor getDoctor_id() {
        return doctor;
    }

    public void setDoctor_id(Doctor doctor_id) {
        this.doctor = doctor_id;
    }

    public Patient() {
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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Patient(Long id, String name, String age, Boolean sex, Long salary) {
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
    Long salary;

    @ManyToMany
    List<Nurse> nurses = new ArrayList<>();

    @OneToOne
    Category category;

    @OneToMany
    List<Medicine> medicines = new ArrayList<>();

    @ManyToOne
    Doctor doctor;
}
