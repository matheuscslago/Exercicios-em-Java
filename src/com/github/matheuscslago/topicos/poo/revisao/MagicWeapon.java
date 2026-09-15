package com.github.matheuscslago.topicos.poo.revisao;

public class MagicWeapon extends MagicEquipment{
    private boolean elementalDamage;

    public MagicWeapon(String id, String name, double basePower, ItemRarity rarity, boolean elementalDamage) {
        super(id, name, basePower, rarity);
        this.elementalDamage = elementalDamage;
    }

    @Override
    public double calculateFinalPower(){
        if(this.elementalDamage) {
            return super.calculateFinalPower() + 500.0;
        }
        return super.calculateFinalPower();
    }
}
