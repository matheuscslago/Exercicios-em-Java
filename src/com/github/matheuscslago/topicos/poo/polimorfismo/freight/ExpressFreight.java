package com.github.matheuscslago.topicos.poo.polimorfismo.freight;

public class ExpressFreight implements FreightStrategy{
    @Override
    public double calculate(double distanceKm, double weightKg) {
        return 25.0 + (distanceKm * 0.9) + (weightKg * 2.50);
    }

    @Override
    public String getCarrierName() {
        return "Loggi Express";
    }
}
