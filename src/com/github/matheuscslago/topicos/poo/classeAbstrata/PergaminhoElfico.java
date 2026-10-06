package com.github.matheuscslago.topicos.poo.classeAbstrata;

public class PergaminhoElfico extends Manuscrito {
    private final int complexidadeLinguistica;


    public PergaminhoElfico(String titulo, int raridade, double conservacao, int complexidadeLinguistica) {
        super(titulo, raridade, conservacao);
        this.complexidadeLinguistica = complexidadeLinguistica;
    }

    @Override
    public double tempoFinalEstimado() {
        return (pontuacaoBase() * 0.5) + (complexidadeLinguistica * 2.0);
    }

    public int getComplexidadeLinguistica() {
        return complexidadeLinguistica;
    }
}
