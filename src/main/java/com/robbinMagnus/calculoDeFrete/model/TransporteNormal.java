package com.robbinMagnus.calculoDeFrete.model;

public class TransporteNormal extends Frete {

    public TransporteNormal(double pesoKg, double distanciaKm){
        super(pesoKg, distanciaKm);
    }
    @Override
    public double calcular() {
        double valorBase = 5.00;
        double custoKm = 0.50;
        double custoKg = 2.00;
        return valorBase + (pesoKg * custoKg) + (distanciaKm * custoKm);
    }

}
