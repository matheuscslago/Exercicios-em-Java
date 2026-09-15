package com.github.matheuscslago.topicos.poo.revisao;

public class MagicArmor extends MagicEquipment {
    private boolean runicShield;

    public MagicArmor(String id, String name, double basePower, ItemRarity rarity, boolean runicShield) {
        super(id, name, basePower, rarity);
        this.runicShield = runicShield;
    }

    @Override
    public double calculateFinalPower(){
        if(this.runicShield){
            return super.calculateFinalPower() + 300.0;
        }
        return super.calculateFinalPower();
    }

}
