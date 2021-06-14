package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {
    public Medicine() {
    }

    public Medicine(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}