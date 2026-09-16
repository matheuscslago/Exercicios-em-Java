package com.github.matheuscslago.topicos.poo.interfaces;

public class EmailNotifier implements Notifier{
    private String smtpServer;

    public EmailNotifier(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("[EMAIL - " + this.smtpServer + "] Sending to: " + recipient + " | Message: " + message);
    }

}
