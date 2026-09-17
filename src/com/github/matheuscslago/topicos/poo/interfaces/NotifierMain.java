package com.github.matheuscslago.topicos.poo.interfaces;

public class NotifierMain {
    static void main(String[] args) {
        EmailNotifier emailNotifier = new EmailNotifier("smtp.com.br");
        SmsNotifier smsNotifier = new SmsNotifier("Vivo");

        System.out.println("---test---");
        emailNotifier.send("Matheus", "ola");
        smsNotifier.alert("Matheus", "ola");

    }
}
