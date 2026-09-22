package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain;

public interface UltimateAbility {
    void executeAbility(String target);

    default void displayCooldown(){
        System.out.println("[COOLDOWN] Ultimate Ability ready to use on the next turn!");
    }
}
