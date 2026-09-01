package com.github.matheuscslago.Exercises.Revisao.Heranca;

public class Main {
    static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 3000.00);
        Gerente g1 = new Gerente("Sara", 8000.00, 2000.00);
        Desenvolvedor d1 = new Desenvolvedor("Matheus", 5000.00, 4);

        System.out.println("=== Summary ===");
        f1.showSummary();
        System.out.println("--------");
        g1.showSummary();
        System.out.println("--------");
        d1.showSummary();

    }
}
