package com.github.matheuscslago.topicos.poo.interfaces;

public interface Notifier {
    String SYSTEM_NAME = "Core Notifier";

    void send(String recipient, String message);

    default void alert(String recipient, String message){
        System.out.println(recipient + " [ALERT] " + message);
    }
}
