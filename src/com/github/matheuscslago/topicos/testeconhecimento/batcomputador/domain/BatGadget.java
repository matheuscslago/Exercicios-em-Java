package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain;

public abstract class BatGadget {
    private String codename;
    private int durability;
    private int energyLevel;

    public BatGadget(String codename, int durability, int energyLevel) {
        this.codename = codename;
        this.durability = durability;
        this.energyLevel = energyLevel;
    }

    public void rechargeEnergy(int amount){
        if(energyLevel + amount <= 100){
            energyLevel += amount;
        }
        else{
            energyLevel = 100;
        }
    }

    public void reduceEnergy(int amount){
        if(energyLevel - amount >= 0){
            energyLevel -= amount;
        }
        else{
            energyLevel = 0;
        }
    }

    public void rechargeDurability(int amount){
        if(durability + amount <= 100){
            durability += amount;
        }
        else{
            durability = 100;
        }
    }

    public void reduceDurability(int amount){
        if(durability - amount >= 0){
            durability -= amount;
        }
        else{
            durability = 0;
        }
    }

    public abstract void deploy(String location, ThreatLevel threat);

    public String getCodename() {
        return codename;
    }

    public int getDurability() {
        return durability;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
