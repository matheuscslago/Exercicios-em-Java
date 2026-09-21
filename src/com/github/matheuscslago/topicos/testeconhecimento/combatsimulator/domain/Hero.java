package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain;

public abstract class Hero {
    protected String name;
    protected int energyLevel;

    public Hero(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public abstract void performAttack();

    public void performAttack(String weaponName) {
        if (weaponName != null) {
            System.out.println(this.name + " attacks using " + weaponName + "!");
        } else {
            performAttack();
        }
    }

    public String getName() {
        if (this.name != null) {
            return name;
        } else {
            return "No name found!";
        }
    }

    public int getEnergyLevel() {
        if (this.energyLevel >= 0) {
            return energyLevel;
        } else {
            return 0;
        }
    }
}
