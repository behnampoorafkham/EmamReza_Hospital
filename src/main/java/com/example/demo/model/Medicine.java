package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {
    public Medicine() {
    }

    public Medicine(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}