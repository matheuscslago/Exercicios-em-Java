package com.github.matheuscslago.topicos.collections.ControleEntrega.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        try {
            Encomenda e1 = new Encomenda("Jat-22", "Minas Gerais", 10, 2.55);
            Encomenda e2 = new Encomenda("Bac-09", "Gramado - RS", 5, 1.29);
            Encomenda e3 = new Encomenda("Xaw-14", "Tocantins", 11, 3.79);
            Encomenda e4 = new Encomenda("Xaw-14", "Areado - MG", 14, 0.19);

            List<Encomenda> encomendas = new ArrayList<>();
            encomendas.add(e1);
            encomendas.add(e2);
            encomendas.add(e3);
            encomendas.add(e4);

            System.out.println("--- Ordem Padrão (Código) ---");

            encomendas.sort(null);
            for (Encomenda encomenda : encomendas) {
                System.out.println(encomenda);
            }

            System.out.println("\n--- Ordem por Peso ---");

            encomendas.sort(new EncomendaPorPeso());
            for (Encomenda encomenda : encomendas) {
                System.out.println(encomenda);
            }

            System.out.println("\n--- Ordem por Prazo ---");

            encomendas.sort(new EncomendaPorPrazo());
            for (Encomenda encomenda : encomendas) {
                System.out.println(encomenda);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}


