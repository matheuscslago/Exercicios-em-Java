package com.github.matheuscslago.topicos.poo.polimorfismo.freight;

public interface FreightStrategy {
    double calculate(double distanceKm, double weightKg);

    default String getCarrierName() {
        return "Generic Carrier";
    }
}
