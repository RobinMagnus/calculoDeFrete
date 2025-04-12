package com.robbinMagnus.calculoDeFrete.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class frete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valorBaseE;
    private Double adicionalKmE;
    private Double adicionalkgE;
}
