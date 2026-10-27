package com.github.matheuscslago.topicos.classesutilitarias.wrappers.service;

import com.github.matheuscslago.topicos.classesutilitarias.wrappers.domain.GuerreiroZ;

public class ScouterProcessor {
    public void processarLeitura(String nome, String poderStr, String raca) {
        if (poderStr == null || poderStr.trim().isEmpty()) {
            throw new IllegalArgumentException("Poder Inválido!");
        }
        int poder = Integer.parseInt(poderStr);
        if (poder > 8000) {
            System.out.println("[Alerta do Scouter] É mais de 8000! (Valor:" + poderStr + ")");
        }
        if (!Character.isUpperCase(raca.charAt(0))) {
            throw new IllegalArgumentException("A raça deve iniciar com letra maiúscula!");
        }

        GuerreiroZ gurreiroZ = new GuerreiroZ(nome, poder, raca);
        System.out.println("Gurreiro registrado com sucesso: " + gurreiroZ.getNome() + " | Raça: " + gurreiroZ.getRaca() + " | Poder: " + gurreiroZ.getNivelPoder());
    }
}
