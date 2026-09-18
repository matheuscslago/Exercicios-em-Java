package com.github.matheuscslago.topicos.poo.polimorfismo;

public class PaymentProcessor {
    public void processTransaction(PaymentMethod paymentMethod, double amount) {
        if (paymentMethod.processPayment(amount)) {
            System.out.println("Transaction APPROVED for the amount of R$ \"" + amount);
        } else {
            System.out.println("Transaction REJECTED for the amount of R$ " + amount);
        }
    }
}
