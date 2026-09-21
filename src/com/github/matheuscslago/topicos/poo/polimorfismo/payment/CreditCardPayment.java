package com.github.matheuscslago.topicos.poo.polimorfismo.payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private double limit;

    public CreditCardPayment(String cardNumber, double limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <= this.limit) {
            this.limit -= amount;
            return true;
        }
        System.out.println("Credit card limit exceeded.");
        return false;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getLimit() {
        return limit;
    }
}
