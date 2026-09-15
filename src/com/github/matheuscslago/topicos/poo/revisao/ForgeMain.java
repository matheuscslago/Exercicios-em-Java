package com.github.matheuscslago.topicos.poo.revisao;

public class ForgeMain {
    static void main(String[] args) {
        AncestralForge forge = new AncestralForge();

        MagicWeapon sword = new MagicWeapon("EQP-100", "Ninchirin", 200.0, ItemRarity.LEGENDARY, true);
        MagicArmor chest = new MagicArmor("EQP-101", "Chest", 150.0, ItemRarity.RARE, true);

        forge.enchant(sword);
        forge.enchant(chest);

        for(ItemRarity r : ItemRarity.values()){
            System.out.println(r.name() + ": " + r.getPowerMultiplier() + "x (Aura: " + r.getAura() + ")");
        }
    }
}
