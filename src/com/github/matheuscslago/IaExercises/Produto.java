package com.github.matheuscslago.IaExercises;

class Impressora{
    public static void imprimirEtiquetaPreco(Produto produto){
        if(produto != null){
            System.out.println("Etiqueta: "+produto.nome+"\nPreço: "+produto.preco);
        }
    }
}

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 1);
    }

    public void gerarEtiqueta(){
        Impressora.imprimirEtiquetaPreco(this);
    }
}

class ExercicioThis {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Construtor Completo (Shadowing) ---");
        Produto p1 = new Produto("Teclado Mechanical", 250.0, 5);
        p1.gerarEtiqueta();

        System.out.println("\n--- Teste 2: Construtor Simplificado (Encadeamento) ---");
        Produto p2 = new Produto("Mousepad Speed", 45.0);
        p2.gerarEtiqueta();
    }
}

