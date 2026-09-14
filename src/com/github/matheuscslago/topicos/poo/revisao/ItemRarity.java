package com.github.matheuscslago.topicos.poo.revisao;

public enum ItemRarity {
    COMMON(1.0, "Lackluster"),
    RARE(1.5, "Blue"),
    LEGENDARY(2.5, "GOLD");

    private final double powerMultiplier;
    private final String aura;

    ItemRarity(double powerMultiplier, String aura) {
        this.powerMultiplier = powerMultiplier;
        this.aura = aura;
    }

    public double calculatePowerRarity(double basePower){
        return basePower * this.powerMultiplier;
    }

    public double getPowerMultiplier() {
        return powerMultiplier;
    }

    public String getAura() {
        return aura;
    }
}
