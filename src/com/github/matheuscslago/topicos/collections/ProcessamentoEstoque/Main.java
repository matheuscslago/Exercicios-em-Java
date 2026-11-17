package com.github.matheuscslago.topicos.collections.ProcessamentoEstoque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        try {
            Ativo at1 = new Ativo("408094", "Computador Escritório");
            Ativo at2 = new Ativo("183626", "Caixa Eletrônico");
            Ativo at3 = new Ativo("948095", "Porta Giratória");
            Ativo at4 = new Ativo("886137", "Detector de Metais");
            Ativo at5 = new Ativo("678898", "Leitor Biométrico");

            List<Ativo> ativos = new ArrayList<>();
            ativos.add(at1);
            ativos.add(at2);
            ativos.add(at3);
            ativos.add(at4);
            ativos.add(at5);

            System.out.println("=== Testes ===");
            System.out.println("Quantidade de ativos registrados na lista: " + ativos.size() + "\n");

            System.out.println("=== Lista Ordenada (ID) ===");

            ativos.sort(null);

            for (Ativo ativo : ativos) {
                System.out.println(ativo);
            }

            int ativoBuscado = Collections.binarySearch(ativos, at1);
            System.out.println("\nAtivo encontrado na posição: " + ativoBuscado);

            ativos.removeIf(ativo -> ativo.getId().equals("678898"));

            System.out.println("\n=== Lista após remoção ==");
            for (Ativo ativo : ativos) {
                System.out.println(ativo);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\n[Processo Finalizado] | Retornando...");
        }
    }
}
