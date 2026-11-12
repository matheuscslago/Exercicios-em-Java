package com.github.matheuscslago.topicos.collections.list;

public class Cliente {
    private final String nome;
    private final String documento;

    public Cliente(String nome, String documento) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome Inválido");
        }
        if(documento == null || documento.isEmpty()){
            throw new IllegalArgumentException("Documento Inválido");
        }
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        return documento.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Cliente cliente = (Cliente) obj;
        return documento.equals(cliente.documento);
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
