package com.robbinMagnus.calculoDeFrete.model;


public class TransporteExpresso extends Frete {
    public TransporteExpresso(double pesoKg, double distanciaKm){
        super(pesoKg, distanciaKm);
    }
    @Override
    public double calcular() {
        double valorBase = 10.00;
        double custoKm = 1.00;
        double custoKg = 5.00;
        return valorBase + (pesoKg * custoKg) + (distanciaKm * custoKm);
    }
}
