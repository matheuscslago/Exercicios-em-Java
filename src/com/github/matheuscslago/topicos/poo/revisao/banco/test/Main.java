package com.github.matheuscslago.topicos.poo.revisao.banco.test;

import com.github.matheuscslago.topicos.poo.revisao.banco.domain.Desenvolvedor;
import com.github.matheuscslago.topicos.poo.revisao.banco.domain.Funcionario;
import com.github.matheuscslago.topicos.poo.revisao.banco.domain.Gerente;
import com.github.matheuscslago.topicos.poo.revisao.banco.exception.ValorInvalidoException;

public class Main {
    static void main(String[] args) {
        try {
            Funcionario dev = new Desenvolvedor("Matheus", 3000.00, "abc123");
            System.out.println("Salário dev = "+dev.calcularSalarioLiquido());

            System.out.println("==========================");

            Funcionario ger = new Gerente("Frodo", 10000.00, "def456");
            System.out.println("Salário gerente = "+ger.calcularSalarioLiquido());

            System.out.println("==========================");

        }catch (IllegalArgumentException | ValorInvalidoException e){
            System.out.println(e.getMessage());
            System.out.println("==========================");
        }finally {
            System.out.println("Finalizado!");
        }
    }
}
