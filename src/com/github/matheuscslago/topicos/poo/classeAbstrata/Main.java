package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class Main {
    static void main(String[] args) {
        PergaminhoElfico pergaminhoElfico = new PergaminhoElfico("O Livro dos Reis", 8, 10.0, 4);
        TomoNumenoreano tomoNumenoreano = new TomoNumenoreano("Crônicas de Osgiliath", 6, 5.0);

        System.out.println("=== Relatório ===");
        System.out.println(pergaminhoElfico);
        System.out.println("----------------");
        System.out.println(tomoNumenoreano);
    }
}
