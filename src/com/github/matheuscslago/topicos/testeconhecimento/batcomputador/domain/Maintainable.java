package com.github.matheuscslago.topicos.testeconhecimento.batcomputador.domain;

public interface Maintainable {
    void performMaintenance();

    default void systemOverride(){
        System.out.println("[Override]: Emergency protocol activated on the equipment!");
    }
}
