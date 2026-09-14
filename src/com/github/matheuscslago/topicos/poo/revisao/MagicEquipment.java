package com.github.matheuscslago.topicos.poo.revisao;

public class MagicEquipment {
    protected final String id = "EQP-";
    protected String name;
    protected double basePower;
    protected ItemRarity rarity;
    public static final double BASE_COST = 100.0;

    public MagicEquipment(String name, double basePower, ItemRarity rarity) {
        this.name = name;
        this.basePower = basePower;
        this.rarity = rarity;
    }

    public double calculateFinalPower(){
        return rarity.calculatePowerRarity(this.basePower) + BASE_COST;
    }

    @Override
    public String toString() {
        return "MagicEquipment{" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", basePower = " + basePower +
                ", rarity = " + rarity +
                '}';
    }
}
