package com.github.matheuscslago.topicos.poo.enumeracao;

public class EnumMain {
    static void main(String[] args) {
        Order o1 = new Order("Mousepad", 0.5, Zone.SUDESTE);
        Order o2 = new Order("Teclado", 1.0, Zone.NORDESTE);
        Order o3 = new Order("Mesa", 35.0, Zone.CENTRO_OESTE);

        System.out.println("===Regional Shipping Calculator===");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("===Regions Available===");
        for(Zone z : Zone.values()) {
            System.out.println(z.name() + ": R$ " + z.getBaseRate() + " (term: " + z.getTimeframe() + " days)");
        }
    }
}
