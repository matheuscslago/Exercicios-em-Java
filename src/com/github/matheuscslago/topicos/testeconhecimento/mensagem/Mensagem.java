package com.github.matheuscslago.topicos.testeconhecimento.mensagem;

public abstract class Mensagem {
    private double custo;
    private String remetente;

    public Mensagem(double custo, String remetente) {
        this.custo = custo;
        this.remetente = remetente;
    }

    public abstract double custoTotal();

    public double getCusto() {
        return this.custo;
    }

    public String getRemetente() {
        return this.remetente;
    }
}
