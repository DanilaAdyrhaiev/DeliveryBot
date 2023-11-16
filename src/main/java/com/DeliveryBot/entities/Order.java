package com.DeliveryBot.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ordering")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String address;

    @OneToMany
    List<Dish> dishes;

}
