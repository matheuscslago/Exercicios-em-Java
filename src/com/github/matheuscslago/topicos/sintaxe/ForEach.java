package com.github.matheuscslago.topicos.sintaxe;

public class ForEach {
    public static double calcularTotalEstoque(double[] precos) {
        if (precos == null) {
            return 0.0;
        }
        double soma = 0.0;
        for (double precoNaPos : precos) {
            soma += precoNaPos;
        }
        return soma;
    }

    public static int contarProdutosEscassos(int[] quantidades, int limiteMinimo) {
        if (quantidades == null) {
            return 0;
        }
        int cont = 0;
        for (int quantProduto : quantidades) {
            if (quantProduto < limiteMinimo) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println("--- Teste 1: Total do Estoque ---");
        double[] precos = {29.90, 100.0, 50.50, 19.90};
        System.out.println("Total: " + calcularTotalEstoque(precos)); // Esperado: 200.30

        System.out.println("\n--- Teste 2: Produtos Escassos ---");
        int[] estoque = {15, 3, 8, 2, 20, 1};
        System.out.println("Escassos (< 5): " + contarProdutosEscassos(estoque, 5)); // Esperado: 3 (produtos com quantidade 3, 2 e 1)
    }
}
