package com.github.matheuscslago.topicos.poo.enumeracao;

public class Main {
    static void main(String[] args) {
        Missao missao1 = new Missao(2000, Rotas.CAMPO_ASTEROIDES, TipoNave.CACA_LEVE);
        Missao missao2 = new Missao(2000, Rotas.PATRULHADO, TipoNave.CACA_LEVE);
        Missao missao3 = new Missao(2000, Rotas.ABERTO, TipoNave.CRUZADOR_ESTELAR);

        System.out.println("=== Relatório ===");
        System.out.println("Custo da missao 1: " + missao1.custoCoaxium() + " unidades de Coaxium)");
        System.out.println("Custo da missao 2: " + missao2.custoCoaxium() + " unidades de Coaxium");
        System.out.println("Custo da missao 3: " + missao3.custoCoaxium() + " unidades de Coaxium");
    }
}
