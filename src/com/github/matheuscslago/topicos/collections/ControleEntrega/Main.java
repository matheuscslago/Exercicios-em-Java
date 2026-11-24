package com.github.matheuscslago.topicos.collections.ControleEntrega;

import java.util.*;

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

            System.out.println("--- Ordem Padrão (Código) ---");
            encomendas.sort(null);
            for (Encomenda encomenda : encomendas) {
                System.out.println(encomenda);
            }

            Set<Encomenda> encomendasSet = new HashSet<>(encomendas);

            encomendas.removeIf(encomenda -> encomenda.getPesoKg() < 2.49);
            System.out.println("\n--- Lista após remoção de encomendas com peso < 2.49 ---");
            for (Encomenda encomenda : encomendasSet) {
                System.out.println(encomenda);
            }

            Map<String, Encomenda> mapa = new HashMap<>();
            for (Encomenda e : encomendasSet) {
                mapa.put(e.getCodigo(), e);
            }
            System.out.println("\n--- Encomenda Buscadada e Encontrada (Jat-22) ---");
            System.out.println(mapa.get("Jat-22"));

            Queue<Encomenda> queue = new PriorityQueue<>(new EncomendaPorPrazo());
            queue.addAll(encomendasSet);
            System.out.println("\n--- Despachando por menor prazo ---");
            while (!queue.isEmpty()) {
                System.out.println("Despachada: " + queue.poll());
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}


