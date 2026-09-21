package com.github.matheuscslago.topicos.poo.polimorfismo.payment;

public class PixPayment implements PaymentMethod {
    private String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("[PIX] Transferring R$ " + amount + " to key pixKey = " + this.pixKey);
        return true;
    }

    public String getPixKey() {
        return pixKey;
    }
}
