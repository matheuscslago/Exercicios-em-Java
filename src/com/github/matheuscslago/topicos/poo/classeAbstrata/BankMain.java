package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class BankMain {
    static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount("Matheus", 500.0);
        SavingsAccount s1 = new SavingsAccount("Potter", 1000.0);

        s1.applyMonthlyIncome();
        c1.applyMonthlyIncome();

        System.out.println(s1);
        System.out.println("-------");
        System.out.println(c1);
    }
}
