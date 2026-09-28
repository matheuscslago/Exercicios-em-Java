package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.service;

import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.BatGadget;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.Maintainable;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain.ThreatLevel;
import com.github.matheuscslago.topicos.testeconhecimento.batcomputador.subclasses.BatMobile;

public class BatCaveControl {
    public void executeTacticalDeploy (BatGadget batGadget, String location, ThreatLevel threatLevel){
        if (batGadget == null || location == null || threatLevel == null) {
            System.out.println("[ERROR]: Invalid parameter provided for tactical deploy.");
            return;
        }

        if(batGadget.getDurability() == 0 || batGadget.getEnergyLevel() == 0){
            System.out.println("Inoperable Equipment");
        }
        else{
            batGadget.deploy(location, threatLevel);
        }
    }

    public void inspectAndRepair(BatGadget batGadget){
        if (batGadget == null) {
            System.out.println("[ERROR]: Invalid parameter provided for inspect and repair.");
            return;
        }

        if(batGadget instanceof Maintainable maintainable){
            maintainable.performMaintenance();
        }
        else{
            System.out.println("[INSPECTION]: Equipment " + batGadget.getCodename() + " is disposable. No maintenance applicable.");
        }

        if(batGadget instanceof BatMobile batMobile){
            batMobile.systemOverride();
        }
    }

    public void runFullInventory(BatGadget[] inventory){
        if (inventory == null) {
            System.out.println("[ERROR]: Invalid Inventory!");
            return;
        }
        else {
            for (BatGadget gadget : inventory) {
                System.out.println("Codename: " + gadget.getCodename());
                System.out.println("Durability: " + gadget.getDurability());
                System.out.println("Energy level: " + gadget.getEnergyLevel());

                inspectAndRepair(gadget);
                System.out.println("------------------");
            }
        }
    }

}
