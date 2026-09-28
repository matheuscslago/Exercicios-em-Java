package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses;

import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.BatGadget;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.ThreatLevel;

public class SmokeBomb extends BatGadget {
    private int smokeRadiusMeters;

    public SmokeBomb(String codename, int durability, int energyLevel, int smokeRadiusMeters) {
        super(codename, durability, energyLevel);
        this.smokeRadiusMeters = smokeRadiusMeters;
    }

    @Override
    public void deploy(String location, ThreatLevel threat) {
        System.out.println("Smoke bomb was detonated in " + location + " (Radius: " + smokeRadiusMeters + "m)");
        reduceDurability(100);
        reduceEnergy(50);
    }

    public int getSmokeRadiusMeters() {
        return smokeRadiusMeters;
    }
}
