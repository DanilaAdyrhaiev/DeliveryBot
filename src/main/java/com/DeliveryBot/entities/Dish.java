package com.DeliveryBot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ID;

    @Column(name = "title", length = 50)
    String title;

    @Column(name = "description", length = 500)
    String description;

    @Column(name = "price")
    double price;
}
