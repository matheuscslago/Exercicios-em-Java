package com.github.matheuscslago.topicos.poo.interfaces;

public class SmsNotifier implements Notifier{
    private String mobileOperator;

    public SmsNotifier(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("[SMS - " + this.mobileOperator + "] Sending to: " + recipient + " | Message: " + message);
    }
}
