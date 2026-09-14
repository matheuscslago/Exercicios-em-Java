package com.github.matheuscslago.topicos.poo.revisao;

public class MagicWeapon extends MagicEquipment{
    private boolean ElementalDamage;

    public MagicWeapon(String name, double basePower, ItemRarity rarity, boolean elementalDamage) {
        super(name, basePower, rarity);
        this.ElementalDamage = elementalDamage;
    }

    @Override
    public double calculateFinalPower(){
        if(this.ElementalDamage) {
            return super.calculateFinalPower() + 500.0;
        }
        return super.calculateFinalPower();
    }
}
