package com.github.matheuscslago.topicos.poo.heranca;

public abstract class Regiao {
    private String nome;
    private String regenteLocal;
    private double tributo;

    public Regiao(String nome, String regenteLocal, double tributo) {
        this.nome = nome;
        this.regenteLocal = regenteLocal;
        this.tributo = tributo;
    }

    public abstract double tributoFinal();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Regiao{" +
                "Nome = '" + nome + '\'' +
                ", Regente Local= '" + regenteLocal + '\'' +
                ", Tributo = " + tributo +
                ", Tributo Final = " + tributoFinal() +
        '}';
    }

    public String getRegenteLocal() {
        return regenteLocal;
    }

    public double getTributo() {
        return tributo;
    }
}
