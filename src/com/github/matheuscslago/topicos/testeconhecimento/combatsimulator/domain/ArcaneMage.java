package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain;

public class ArcaneMage extends Hero implements UltimateAbility{
    private int manaPoints;

    public ArcaneMage(String name, int energyLevel, int manaPoints) {
        super(name, energyLevel);
        this.manaPoints = manaPoints;
    }

    @Override
    public void performAttack() {
        System.out.println(this.name + " attacks using fireball!");
    }

    @Override
    public void executeAbility(String target) {
        System.out.println(this.name + " attacked " + target + " with [Ultimate Ability] SuperNova!");
    }

    public int getManaPoints(int manaPoints) {
        if (manaPoints >= 0) {
            return this.manaPoints;
        } else {
            return 0;
        }
    }
}
