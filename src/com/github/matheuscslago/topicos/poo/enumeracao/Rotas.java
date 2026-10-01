package com.github.matheuscslago.topicos.poo.enumeracao;

public enum Rotas {
    ABERTO(1.0),
    CAMPO_ASTEROIDES(1.5),
    PATRULHADO(2.0);

    private final double fatorAdicional;

    Rotas(double fatorAdicional) {
        this.fatorAdicional = fatorAdicional;
    }

    public double getFatorAdicional() {
        return fatorAdicional;
    }
}
