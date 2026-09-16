package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyMonthlyIncome() {
        balance *= 1.005;
    }
}
