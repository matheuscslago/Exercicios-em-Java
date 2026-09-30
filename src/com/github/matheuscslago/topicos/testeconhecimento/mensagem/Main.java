package com.github.matheuscslago.topicos.testeconhecimento.mensagem;

public class Main {
    static void main(String[] args) {
        Mensagem m1 = new MensagemUrgente(10, "Frodo");

        System.out.println(m1.getRemetente() + " " + m1.custoTotal());
    }
}
