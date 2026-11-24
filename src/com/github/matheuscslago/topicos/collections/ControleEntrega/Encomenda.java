package com.github.matheuscslago.topicos.collections.ControleEntrega;

import java.util.Objects;

public class Encomenda implements Comparable<Encomenda>{
    private final String codigo;
    private final String destino;
    private final int prazoDias;
    private final double pesoKg;

    public Encomenda(String codigo, String destino, int prazoDias, double pesoKg) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido!");
        }
        if (destino == null || destino.isEmpty()) {
            throw new IllegalArgumentException("Destino inexistente!");
        }
        if (prazoDias < 0) {
            throw new IllegalArgumentException("Prazo não deve ser negativo!");
        }
        if (pesoKg < 0) {
            throw new IllegalArgumentException("Peso não deve ser negativo!");
        }
        this.codigo = codigo;
        this.destino = destino;
        this.prazoDias = prazoDias;
        this.pesoKg = pesoKg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Encomenda encomenda = (Encomenda) o;
        return Objects.equals(codigo, encomenda.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public int compareTo(Encomenda o) {
        Objects.requireNonNull(o);
        return codigo.compareTo(o.codigo);
    }

    @Override
    public String toString() {
        return "{" +
                "codigo = " + codigo +
                " | destino = " + destino +
                " | prazoDias = " + prazoDias +
                " | pesoKg = " + pesoKg +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public int getPrazoDias() {
        return prazoDias;
    }

    public double getPesoKg() {
        return pesoKg;
    }
}
