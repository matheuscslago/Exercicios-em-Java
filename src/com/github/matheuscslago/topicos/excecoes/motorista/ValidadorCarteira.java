package com.github.matheuscslago.topicos.excecoes.motorista;

public class ValidadorCarteira {
    public void verificarIdade(int idade){
        if(idade < 0 || idade > 120){
            throw new IllegalArgumentException("Idade impossível de ser processada!");
        }
        if(idade < 18){
            throw new IdadeInvalidaException("Apenas maiores de 18 anos podem tirar sua CNH!");
        }
        System.out.println("Idade permitida! Cadastro aprovado!");
    }

}
