package com.github.matheuscslago.topicos.poo.polimorfismo.freight;

public class FreightService {
    public void displayQuote(FreightStrategy strategy, String destiny, double distanceKm, double weightKg) {
        String carrier = strategy.getCarrierName();
        double totalFreight = strategy.calculate(distanceKm, weightKg);
        System.out.println("Carrier [" + carrier + "]\nDestination: " + destiny + "\nDistance: " + distanceKm + " Km | Weight: " + weightKg + " KG\nTotal Freight: R$ " + totalFreight);
    }
}
