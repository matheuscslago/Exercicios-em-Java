package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.test;

import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.BatGadget;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.ThreatLevel;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.service.BatCaveControl;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses.BatMobile;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses.GrappleLauncher;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses.SmokeBomb;

public class BatComputerTest {
    static void main(String[] args) {
        BatGadget gadget1 = new BatMobile("Tumbler Tank", 100, 100, true);
        BatGadget gadget2 = new GrappleLauncher("G-Hook v2", 100, 100, 50);
        BatGadget gadget3 = new SmokeBomb("Shadow Pellet", 100, 100, 15);

        BatGadget[] batGadgets = new BatGadget[]{gadget1, gadget2, gadget3};

        BatCaveControl control = new BatCaveControl();

        control.executeTacticalDeploy(gadget1, "Gotham City", ThreatLevel.LOW);
        control.executeTacticalDeploy(gadget2, "Gotham City", ThreatLevel.CRITICAL);
        control.executeTacticalDeploy(gadget3, "Gotham City", ThreatLevel.MODERATE);
        System.out.println("===================================");

        control.runFullInventory(batGadgets);
    }

}
