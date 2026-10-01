package com.github.matheuscslago.topicos.poo.heranca;

public class Main {
    static void main(String[] args) {
        Agricola regiaoA = new Agricola("Pelenor", "Lorde Erchirion", 5000.0, 120);
        Portuaria regiaoP = new Portuaria("Pelargir", "Lorde Angbor", 8000.0, 10);

        System.out.println("=== Relatório ===");
        System.out.println(regiaoA);
        System.out.println("=======");
        System.out.println(regiaoP);
    }
}
