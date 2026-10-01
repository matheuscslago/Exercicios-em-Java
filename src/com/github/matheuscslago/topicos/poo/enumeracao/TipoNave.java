package com.github.matheuscslago.topicos.poo.enumeracao;

public enum TipoNave {
    CACA_LEVE(1.2),
    CARGUEIRO(1.5),
    CRUZADOR_ESTELAR(5.0);

    private final double multiplicadorBase;

    TipoNave(double multiplicadorBase) {
        this.multiplicadorBase = multiplicadorBase;
    }

    public double getMultiplicadorBase() {
        return multiplicadorBase;
    }
}
