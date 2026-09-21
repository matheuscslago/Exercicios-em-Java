package com.github.matheuscslago.topicos.poo.polimorfismo.freight;

public class FreightMain {
    static void main(String[] args) {
        FreightService service = new FreightService();

        FreightStrategy express = new ExpressFreight();
        FreightStrategy standard = new StandardFreight();

        service.displayQuote(express, "São Paulo - SP", 150.0, 4.5);
        System.out.println("----------------------");
        service.displayQuote(standard, "São Paulo - SP", 150.0, 4.5);
    }
}
