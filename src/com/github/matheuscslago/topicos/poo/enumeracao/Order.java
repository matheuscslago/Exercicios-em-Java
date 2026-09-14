package com.github.matheuscslago.topicos.poo.enumeracao;

public class Order {
    private String description;
    private double weight;
    private Zone destiny;

    public Order(String description, double weight, Zone destiny) {
        this.description = description;
        this.weight = weight;
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return "Order{" +
                "description = '" + description + '\'' +
                ", weight = " + weight +
                ", term = " + this.destiny.getTimeframe() +
                ", freight = " + this.destiny.calculateTotalCost(this.weight) +
                " R$ , destiny = " + destiny +
                '}';
    }
}
