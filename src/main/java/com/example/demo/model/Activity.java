package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {

    @Id
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Long price;
}

