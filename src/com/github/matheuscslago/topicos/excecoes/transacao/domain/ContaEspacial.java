package com.github.matheuscslago.topicos.excecoes.transacao.domain;

import com.github.matheuscslago.topicos.excecoes.transacao.exceptions.ContaInvalidaException;

public class ContaEspacial {
    private final String idConta;
    private final String nomePiloto;
    private double saldoCreditos;

    public ContaEspacial(String idConta, String nomePiloto, double saldoCreditos) {
        if (idConta != null && idConta != " ") {
            this.idConta = idConta;
        } else {
            throw new ContaInvalidaException("id de conta inválido");
        }
        if (saldoCreditos < 0.0) {
            this.saldoCreditos = saldoCreditos;
        } else {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.nomePiloto = nomePiloto;
    }

    public String getIdConta() {
        return idConta;
    }

    public String getNomePiloto() {
        return nomePiloto;
    }

    public double getSaldoCreditos() {
        return saldoCreditos;
    }

    public void setSaldoCreditos(double saldoCreditos) {
        this.saldoCreditos += saldoCreditos;
    }
}
