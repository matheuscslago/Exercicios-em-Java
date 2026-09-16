package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void applyMonthlyIncome() {
        balance -= 15.00;
    }


}
