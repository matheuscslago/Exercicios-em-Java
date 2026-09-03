package com.github.matheuscslago.topicos.poo.basicos;

public class ExercicioBlocoEConstrutor {
    static void main(String[] args) {
        System.out.println("--- Criando Item 1 ---");
        Item item1 = new Item("Teclado Mecânico", 250.0);
        System.out.println("Item: " + item1.getNome() + " | Código: " + item1.getCodigo() + " | Preço: R$ " + item1.getPreco());

        System.out.println("\n--- Criando Item 2 ---");
        Item item2 = new Item("Mousepad Simples"); // Deve chamar o construtor sobrecarregado
        System.out.println("Item: " + item2.getNome() + " | Código: " + item2.getCodigo() + " | Preço: R$ " + item2.getPreco());
    }
}

class Item{
    private String codigo;
    private String nome;
    private double preco;
    {
        codigo = ("ITEM-"+(int)(Math.random() * 9000 + 1000));
        System.out.println("[Sistema]: Gerando código altomático: "+codigo);
    }

    public Item(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Item(String nome){
        this(nome, 0.0);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
