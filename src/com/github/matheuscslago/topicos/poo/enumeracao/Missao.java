package com.github.matheuscslago.topicos.poo.enumeracao;

public class Missao {
    private int distancia;
    private Rotas rota;
    private TipoNave nave;

    public Missao(int distancia, Rotas rota, TipoNave nave) {
        this.distancia = distancia;
        this.rota = rota;
        this.nave = nave;
    }

    public double custoCoaxium(){
        return distancia * rota.getFatorAdicional() * nave.getMultiplicadorBase();
    }
}
