package com.github.matheuscslago.topicos.poo.polimorfismo.payment;

public class PolymorphismMain {
    static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCardPayment = new CreditCardPayment("10923", 1000.0);
        PaymentMethod pixPayment = new PixPayment("matheus@dev.br");

        processor.processTransaction(creditCardPayment, 300.0);
        processor.processTransaction(creditCardPayment, 5000.0);
        processor.processTransaction(pixPayment, 500.0);
    }
}
