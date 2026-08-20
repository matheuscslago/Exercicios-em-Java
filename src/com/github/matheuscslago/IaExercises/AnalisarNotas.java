package com.github.matheuscslago.IaExercises;

public class AnalisarNotas {
    public static double calcularNotaAprovados(double notaCorte, double... notas) {
        double media = 0;
        int aprovados = 0;
        if (notas.length == 0) {
            return 0.0;
        }
        for (double notaAluno : notas) {
            if (notaAluno >= notaCorte) {
                media += notaAluno;
                aprovados++;
            }
        }
        if (aprovados == 0) {
            return 0.0;
        }

        return media / aprovados;
    }

    static void main() {
        // Teste 1: Notas mistas com corte 7.0 (Apenas 8.0, 9.5 e 7.0 devem entrar na média)
        double media1 = calcularNotaAprovados(7.0, 5.5, 8.0, 9.5, 6.0, 7.0);
        System.out.printf("Teste 1 - Média Aprovados: %.2f (Esperado: 8,17)%n", media1);

        // Teste 2: Ninguém atingiu a nota de corte 9.0
        double media2 = calcularNotaAprovados(9.0, 5.0, 6.0, 7.0);
        System.out.printf("Teste 2 - Média Aprovados: %.2f (Esperado: 0,00)%n", media2);

        // Teste 3: Nenhum argumento passado no Varargs
        double media3 = calcularNotaAprovados(7.0);
        System.out.printf("Teste 3 - Média Aprovados: %.2f (Esperado: 0,00)%n", media3);
    }
}
