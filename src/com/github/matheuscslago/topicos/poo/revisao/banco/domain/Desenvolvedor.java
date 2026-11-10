package com.github.matheuscslago.topicos.poo.revisao.banco.domain;

import com.github.matheuscslago.topicos.poo.revisao.banco.exception.ValorInvalidoException;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario, String documento) {
        super(nome, salario, documento);
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioLiquido = getSalario() - (getSalario()*0.15);
        if(salarioLiquido < 0){
            throw new ValorInvalidoException("[ERRO] Salário Liquido inválido (<0)");
        }
        return salarioLiquido;
    }
}
