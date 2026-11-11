package com.github.matheuscslago.topicos.collections.hashequals;

public class ItemInventario {
    private final String id;
    private final String nome;

    public ItemInventario(String id, String nome) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Argumento inválido (nulo ou vazio)");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Argumento inválido (nulo ou vazio)");
        }
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ItemInventario itemInventario = (ItemInventario) obj;
        return id.equals(itemInventario.id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : this.id.hashCode();
    }

}
