package com.github.matheuscslago.topicos.poo.heranca;

public class Portuaria extends Regiao {
    private int quantNavios;

    public Portuaria(String nome, String regenteLocal, double tributo, int quantNavios) {
        super(nome, regenteLocal, tributo);
        this.quantNavios = quantNavios;
    }

    @Override
    public double tributoFinal() {
        return getTributo() + (quantNavios * 50.0) - 200.0;
    }

    public int getQuantNavios() {
        return quantNavios;
    }
}
