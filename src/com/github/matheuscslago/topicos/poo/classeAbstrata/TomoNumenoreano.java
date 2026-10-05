package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class TomosNumenoreano extends Manuscrito {

    public TomosNumenoreano(String titulo, int raridade, double conservacao) {
        super(titulo, raridade, conservacao);
    }

    @Override
    public double tempoFinalEstimado() {
        return 5.0 + pontuacaoBase() * 1.2;
    }
}
