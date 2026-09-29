package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses;

import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.BatGadget;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.Maintainable;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.ThreatLevel;

public class GrappleLauncher extends BatGadget implements Maintainable {
    private int cableLengthMeters;

    public GrappleLauncher(String codename, int durability, int energyLevel, int cableLengthMeters) {
        super(codename, durability, energyLevel);
        this.cableLengthMeters = cableLengthMeters;
    }

    @Override
    public void deploy(String location, ThreatLevel threat) {
        if (threat != null) {
            System.out.println("Hook triggered in " + location);
            reduceDurability(5 * threat.getDamageFactor());
            reduceEnergy(10);
        }
    }

    @Override
    public void performMaintenance() {
        rechargeDurability(100);
        System.out.println("The " + cableLengthMeters + "m cable was recalibrated for " + getCodename() + "!");
    }

    public void setCableLengthMeters(int cableLengthMeters) {
        this.cableLengthMeters = cableLengthMeters;
    }

    public int getCableLengthMeters() {
        return cableLengthMeters;
    }

}
