package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.service;

import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.CyberSamurai;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.Hero;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.UltimateAbility;

public class ArenaService {
    public void processTurn(Hero hero, String target, String weapon){
        hero.performAttack();
        hero.performAttack(weapon);

        if(hero instanceof UltimateAbility){
            ((UltimateAbility) hero).executeAbility(target);
            ((UltimateAbility) hero).displayCooldown();
        }else{
            System.out.println("This player don´t have Ultimate Ability!");
        }
    }

    public void runSystemDiagnostic(Hero hero){
        if(hero instanceof CyberSamurai){
            ((CyberSamurai) hero).displayCooldown();
        }
        else{
            System.out.println("No cyber components found in this player!");
        }
    }
}
