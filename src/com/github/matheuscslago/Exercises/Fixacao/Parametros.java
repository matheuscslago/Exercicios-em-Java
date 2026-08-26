package com.github.matheuscslago.Exercises.Fixacao;

class Jogador {
    String nome;
    int pontosXp;

    Jogador(String nome, int pontosXp) {
        this.nome = nome;
        this.pontosXp = pontosXp;
    }
}

public class Parametros {

    public static void tentarIncrementarNivel(int nivel) {
        nivel += 1;
    }

    public static void adicionarXP(Jogador jogador, int xpGanhos) {
        if (jogador != null) {
            jogador.pontosXp += xpGanhos;
        }
    }

    public static void resetarJogador(Jogador jogador) {
        jogador = new Jogador("Novato", 0);
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Teste Parâmetro Primitivo ---");
        int nivelAtual = 10;
        tentarIncrementarNivel(nivelAtual);
        System.out.println("Nível após o método: " + nivelAtual);
        // Esperado: 10 (Não deve mudar)

        System.out.println("\n--- 2. Teste Alteração de Atributo de Objeto ---");
        Jogador player1 = new Jogador("ProPlayer", 500);
        adicionarXP(player1, 250);
        System.out.println("XP do " + player1.nome + ": " + player1.pontosXp);
        // Esperado: 750 (Deve alterar o objeto original)

        System.out.println("\n--- 3. Teste Reatribuição de Referência ---");
        resetarJogador(player1);
        System.out.println("Nome do jogador após reset: " + player1.nome);
        // Esperado: ProPlayer (A referência no main NÃO deve mudar para 'Novato')
    }


}


