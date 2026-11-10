package com.github.matheuscslago.topicos.poo.revisao.banco.domain;

import com.github.matheuscslago.topicos.poo.revisao.banco.exception.ValorInvalidoException;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected String documento;

    public Funcionario(String nome, double salario, String documento) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("[ERRO] Nome não pode ser nulo/vazio!");
        }
        if(salario < 0){
            throw new ValorInvalidoException("[ERRO] Salário não pode ser negativo!");
        }
        if(documento == null || documento.isEmpty()){
            throw new IllegalArgumentException("[ERRO] Documento inválido!");
        }
        this.nome = nome;
        this.salario = salario;
        this.documento = documento;
    }

    public abstract double calcularSalarioLiquido();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDocumento() {
        return documento;
    }
}
