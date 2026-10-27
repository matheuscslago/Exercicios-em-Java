package com.github.matheuscslago.topicos.classesutilitarias.wrappers.domain;

import com.github.matheuscslago.topicos.classesutilitarias.wrappers.exceptions.PoderInvalidoException;

public class GuerreiroZ {
    private final String nome;
    private Integer nivelPoder;
    private final String raca;

    public GuerreiroZ(String nome, Integer nivelPoder, String raca) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do gurreiro não pode ser vazio!");
        }
        if(nivelPoder < 0){
            throw new PoderInvalidoException("O nível de poder não pode ser negativo!");
        }
        if(raca == null || raca.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do gurreiro não pode ser vazio!");
        }
    this.nome = nome;
    this.nivelPoder = nivelPoder;
    this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNivelPoder() {
        return nivelPoder;
    }

    public String getRaca() {
        return raca;
    }
}
