package com.github.matheuscslago.topicos.poo.classeAbstrata;

public abstract class BankAccount {
    protected String owner;
    protected double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public abstract void applyMonthlyIncome();

    public void deposit(double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance + " R$" +
                '}';
    }
}
