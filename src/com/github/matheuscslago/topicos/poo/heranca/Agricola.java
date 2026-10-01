package com.github.matheuscslago.topicos.poo.heranca;

public class Agricola extends Regiao{
    private int toneladaGraos;

    public Agricola(String nome, String regenteLocal, double tributo, int toneladaGraos) {
        super(nome, regenteLocal, tributo);
        this.toneladaGraos = toneladaGraos;
    }

    @Override
    public double tributoFinal() {
        return getTributo() + (toneladaGraos * 15.0);
    }

    public int getToneladaGraos() {
        return toneladaGraos;
    }
}
