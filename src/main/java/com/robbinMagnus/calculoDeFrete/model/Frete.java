package com.robbinMagnus.calculoDeFrete.model;

public abstract class Frete {
    protected double pesoKg;
    protected double distanciaKm;

    public Frete(double pesoKg, double distanciaKm) {
        this.pesoKg = pesoKg;
        this.distanciaKm= distanciaKm;

    }
    public abstract double calcular();


    public double getPesoKg() {
        return pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}


