package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses;

import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.BatGadget;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.Maintainable;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.ThreatLevel;

public class BatMobile extends BatGadget implements Maintainable {
    private boolean armorPlatingActive;

    public BatMobile(String codename, int durability, int energyLevel, boolean armorPlatingActive) {
        super("Bat Mobile", durability, energyLevel);
        this.armorPlatingActive = armorPlatingActive;
    }

    @Override
    public void deploy(String location, ThreatLevel threat) {
        System.out.println("BatMobile was activate in " + location);
        if(armorPlatingActive){
            reduceEnergy(20);
            reduceDurability(10 * threat.getDamageFactor());
        }
    }

    @Override
    public void performMaintenance() {
        rechargeDurability(100);
        System.out.println("Complete armor and engine inspection!");
    }
}
