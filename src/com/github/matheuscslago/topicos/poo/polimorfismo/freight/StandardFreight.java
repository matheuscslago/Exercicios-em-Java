package com.github.matheuscslago.topicos.poo.polimorfismo.freight;

public class StandardFreight implements FreightStrategy{
    @Override
    public double calculate(double distanceKm, double weightKg) {
        return 10.0 + (distanceKm * 0.5) + (weightKg * 1.20);
    }

    @Override
    public String getCarrierName() {
        return "Correios - PAC";
    }
}
