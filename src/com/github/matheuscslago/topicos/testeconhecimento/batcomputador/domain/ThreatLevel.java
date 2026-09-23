package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain;

public enum ThreatLevel {
    LOW(1),
    MODERATE(2),
    CRITICAL(3);

    private final int damageFactor;

    ThreatLevel(int wear) {
        this.damageFactor = wear;
    }

    public int getDamageFactor() {
        return damageFactor;
    }
}
