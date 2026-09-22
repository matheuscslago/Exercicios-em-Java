package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain;

public class CyberSamurai extends Hero implements UltimateAbility{
    private int cyberwareIntegrity;

    public CyberSamurai(String name, int energyLevel, int cyberwareIntegrity) {
        super(name, energyLevel);
        this.cyberwareIntegrity = cyberwareIntegrity;
    }

    @Override
    public void performAttack() {
        System.out.println(this.name + " attacks using Plasma Shooter");
    }

    @Override
    public void executeAbility(String target) {
        System.out.println(this.name + " attacked " + target + " with [Ultimate Ability] Sword Slash!");
    }

    public void rebootCyberware(){
        System.out.println("[CYBER SYSTEM]: Rebooting cyber firmware from " + this.name + " | Integrity in " + cyberwareIntegrity + "%");
    }

    public int getCyberwareIntegrity() {
        if(cyberwareIntegrity > 0) {
            return cyberwareIntegrity;
        }
        else{
            return 0;
        }
    }
}
