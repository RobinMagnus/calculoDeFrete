package com.robbinMagnus.calculoDeFrete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class transporteExpresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer valorBaseE;
    private Integer adicionalKmE;
    private Integer adicionalkgE;
}
