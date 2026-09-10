package com.github.matheuscslago.topicos.poo.enumeracao;

public enum Zone {
    SUDESTE(15.00, 2),
    SUL(20.00, 3),
    CENTRO_OESTE(25.00, 4),
    NORDESTE(35.00, 5),
    NORTE(50.00, 8),
    ;

    private final double baseRate;
    private final int timeframe;

    Zone(double baseRate, int timeframe) {
        this.baseRate = baseRate;
        this.timeframe = timeframe;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public int getTimeframe() {
        return timeframe;
    }

    public double calculateTotalCost(double weight) {
        return baseRate + (weight * 2);
    }

}

