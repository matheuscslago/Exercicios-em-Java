package com.github.matheuscslago.topicos.poo.basicos;

public class ExercicioModificadores {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Geralt", 10, 80.0);

        System.out.println("--- Teste 1: Estado Inicial ---");
        System.out.println("Heroi: " + heroi.getNome() + " | Vida: " + heroi.getVida());

        System.out.println("\n--- Teste 2: Recebendo Dano Excessivo ---");
        heroi.receberDano(150.0); // Vida não pode ficar negativa (deve ajustar para 0.0)
        System.out.println("Vida após dano letal: " + heroi.getVida());

        System.out.println("\n--- Teste 3: Cura Excessiva ---");
        heroi.curarVida(200.0); // Vida não pode passar de 100.0
        System.out.println("Vida após cura máxima: " + heroi.getVida());
    }
}

class Personagem {
    private String nome;
    private int nivel;
    private double vida;

    public Personagem(String nome, int nivel, double vida) {
        setNome(nome);
        setNivel(nivel);
        setVida(vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if (vida < 0.0) {
            this.vida = 0.0;
        } else if (vida > 100.0) {
            this.vida = 100.0;
        } else {
            this.vida = vida;
        }
    }

    public void receberDano(double dano) {
        setVida(getVida() - dano);
    }

    public void curarVida(double cura) {
        setVida(getVida() + cura);
    }
}
