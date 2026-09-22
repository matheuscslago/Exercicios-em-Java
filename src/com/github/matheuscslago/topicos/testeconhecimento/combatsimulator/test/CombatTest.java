package com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.test;

import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.ArcaneMage;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.CyberSamurai;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.Hero;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.domain.UltimateAbility;
import com.github.matheuscslago.topicos.testeconhecimento.combatsimulator.service.ArenaService;

public class CombatTest {
    static void main(String[] args) {
        ArenaService turn = new ArenaService();
        Hero samurai = new CyberSamurai("TG-500", 29, 100);
        Hero mage = new ArcaneMage("Gandalf", 37, 380);

        System.out.println("=== 1º Turn ===");
        turn.processTurn(samurai, "Sub-Zero", "Phantom Sword");
        System.out.println("-----------------");
        turn.runSystemDiagnostic(samurai);

        System.out.println("\n======================\n");

        System.out.println("=== 2º Turn ===");
        turn.processTurn(mage, "Saurus", "Magic Staff");
        System.out.println("-----------------");
        turn.runSystemDiagnostic(mage);
    }

}
