package com.github.matheuscslago.topicos.excecoes.transacao.service;

import com.github.matheuscslago.topicos.excecoes.transacao.domain.ContaEspacial;
import com.github.matheuscslago.topicos.excecoes.transacao.exceptions.ContaInvalidaException;
import com.github.matheuscslago.topicos.excecoes.transacao.exceptions.SaldoInsuficienteException;

public class ProcessadorTransacao {
    private static final double TAXA_COMBUSTIVEL = 5.0;


    public void transferir(ContaEspacial origem, ContaEspacial destino, double valor){
        if(origem == null || destino == null){
            throw new ContaInvalidaException("As contas de origem e destino não podem ser nulas.");
        }else if(origem.getIdConta() == destino.getIdConta()){
            throw new ContaInvalidaException("Não é possível realizar transferência para a mesma conta.");
        }

        final double valorTotal = valor + TAXA_COMBUSTIVEL;
        if(origem.getSaldoCreditos() < valorTotal){
            throw new SaldoInsuficienteException("[Creditos invalidos]: Saldo atual: " + origem.getSaldoCreditos() + " | Valor a ser debitado: " + valorTotal);
        }else{
            origem.setSaldoCreditos(-1 * valorTotal);
            destino.setSaldoCreditos(valor);
        }
    }
}
