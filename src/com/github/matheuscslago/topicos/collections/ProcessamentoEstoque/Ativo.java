package com.github.matheuscslago.topicos.collections.ProcessamentoEstoque;

import java.util.Objects;

public class Ativo implements Comparable<Ativo> {
    private final String id;
    private final String nome;

    public Ativo(String id, String nome) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID inválido.");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ativo ativo = (Ativo) o;
        return Objects.equals(id, ativo.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Ativo o) {
        return getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Ativo{" +
                "id = " + id +
                " | nome = " + nome +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
