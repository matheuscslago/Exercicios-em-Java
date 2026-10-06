package com.github.matheuscslago.topicos.poo.classeAbstrata;

public abstract class Manuscrito {
    private final String titulo;
    private final int raridade;
    private double conservacao;

    public Manuscrito(String titulo, int raridade, double conservacao) {
        this.titulo = titulo;
        this.raridade = raridade;
        this.conservacao = conservacao;
    }

    public double pontuacaoBase() {
        return this.raridade * this.conservacao;
    }

    public abstract double tempoFinalEstimado();

    @Override
    public String toString() {
        return "Manuscritos{" +
                "titulo='" + titulo + '\'' +
                ", raridade=" + raridade +
                ", conservacao=" + conservacao +
                ", dias necessários = " + tempoFinalEstimado() +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getRaridade() {
        return raridade;
    }

    public double getConservacao() {
        return conservacao;
    }
}
