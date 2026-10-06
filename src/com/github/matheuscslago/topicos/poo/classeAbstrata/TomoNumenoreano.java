package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class TomoNumenoreano extends Manuscrito {

    public TomoNumenoreano(String titulo, int raridade, double conservacao) {
        super(titulo, raridade, conservacao);
    }

    @Override
    public double tempoFinalEstimado() {
        return 5.0 + pontuacaoBase() * 1.2;
    }
}
