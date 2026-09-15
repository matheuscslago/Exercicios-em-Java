package com.github.matheuscslago.topicos.poo.revisao;

public final class AncestralForge {
    public final void enchant(MagicEquipment equip){
        System.out.println("[---Guild Certificate---]");
        System.out.println("Item: " + equip);
        System.out.println("Aura: " + equip.getRarity().getAura());
        System.out.println("Final Power: " + equip.calculateFinalPower());
        System.out.println("-------------------------");
    }

}
