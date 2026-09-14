package com.github.matheuscslago.topicos.poo.basicos;

public class ExercicioBlocoEConstrutor {
    static void main(String[] args) {
        System.out.println("--- Criando Item 1 ---");
        ItemConstrutor itemConstrutor1 = new ItemConstrutor("Teclado Mecânico", 250.0);
        System.out.println("Item: " + itemConstrutor1.getNome() + " | Código: " + itemConstrutor1.getCodigo() + " | Preço: R$ " + itemConstrutor1.getPreco());

        System.out.println("\n--- Criando Item 2 ---");
        ItemConstrutor itemConstrutor2 = new ItemConstrutor("Mousepad Simples"); // Deve chamar o construtor sobrecarregado
        System.out.println("Item: " + itemConstrutor2.getNome() + " | Código: " + itemConstrutor2.getCodigo() + " | Preço: R$ " + itemConstrutor2.getPreco());
    }
}

class ItemConstrutor {
    private String codigo;
    private String nome;
    private double preco;
    {
        codigo = ("ITEM-"+(int)(Math.random() * 9000 + 1000));
        System.out.println("[Sistema]: Gerando código altomático: "+codigo);
    }

    public ItemConstrutor(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public ItemConstrutor(String nome){
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
