package com.DeliveryBot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "OrderDish")
public class OrderDish {
    @Id
    Long id;
    @OneToOne
    @JoinColumn(name = "Ordering_id")
    private Order order;

    @OneToOne
    @JoinColumn(name = "Dish_id")
    private Dish dish;
}
