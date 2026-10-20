package com.github.matheuscslago.topicos.excecoes.transacao.teste;

import com.github.matheuscslago.topicos.excecoes.transacao.domain.ContaEspacial;
import com.github.matheuscslago.topicos.excecoes.transacao.exceptions.ContaInvalidaException;
import com.github.matheuscslago.topicos.excecoes.transacao.exceptions.SaldoInsuficienteException;
import com.github.matheuscslago.topicos.excecoes.transacao.service.ProcessadorTransacao;

public class MainTesteTransacao {
    static void main(String[] args) {
        ContaEspacial contaEspacial1 = new ContaEspacial("ABC123", "Matheus", 1500.0);
        ContaEspacial contaEspacial2 = new ContaEspacial("DEF456", "Goku", 378.0);
        ProcessadorTransacao transacao = new ProcessadorTransacao();

        System.out.println("=== Teste 1 ===");
        try {
            transacao.transferir(contaEspacial1, contaEspacial2, 700.0);
        } catch (ContaInvalidaException | SaldoInsuficienteException e) {
            System.out.println("[Erro]" + e.getMessage());
        } finally {
            System.out.println("Operação Finalizada!");
        }

        System.out.println("=== Teste 2 ===");
        try {
            transacao.transferir(contaEspacial1, contaEspacial2, 1500.0);
        } catch (ContaInvalidaException | SaldoInsuficienteException e) {
            System.out.println("[Erro]" + e.getMessage());
        } finally {
            System.out.println("Operação Finalizada!");
        }

        System.out.println("=== Teste 3 ===");
        try {
            transacao.transferir(contaEspacial1, contaEspacial1, 700.0);
        } catch (ContaInvalidaException | SaldoInsuficienteException e) {
            System.out.println("[Erro]" + e.getMessage());
        } finally {
            System.out.println("Operação Finalizada!");
        }
    }
}
