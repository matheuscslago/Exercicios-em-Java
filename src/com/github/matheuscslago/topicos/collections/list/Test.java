package com.github.matheuscslago.topicos.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void main(String[] args) {
        try {
            Cliente c1 = new Cliente("Matheus", "123");
            Cliente c2 = new Cliente("Anakin", "126");
            Cliente c3 = new Cliente("Frodo", "124");
            Cliente c4 = new Cliente("Goku", "125");


            List<Cliente> fila = new ArrayList<>();
            fila.add(c1);
            fila.add(c2);
            fila.add(c3);
            fila.add(c4);
            fila.add(c1);

            System.out.println("Tamanho da fila: " + fila.size());

            Cliente c5 = new Cliente("Ussop", "125");
            System.out.println(fila.contains(c5));

            fila.remove(0);
            System.out.println("Primeiro da fila removido! Tamanho da lista atual: "+fila.size());

            for(Cliente cliente: fila){
                System.out.println(cliente);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
