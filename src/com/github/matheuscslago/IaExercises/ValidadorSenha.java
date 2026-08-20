package com.github.matheuscslago.IaExercises;

public class ValidadorSenha {
    public static boolean temTamMinimo(String senha, int tamMinimo) {
        return senha != null && senha.length() >= tamMinimo;
    }

    public static int ContarDigitos(String senha) {
        if (senha == null) {
            return 0;
        }
        int cont = 0;

        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                cont++;
            }
        }
        return cont;
    }

    public static String ClassificarSenha(String senha) {
        if (!temTamMinimo(senha, 8)) {
            return "FRACA";
        }

        if (ContarDigitos(senha) < 2) {
            return "MEDIA";
        }

        return "FORTE";


    }

    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println(ClassificarSenha("aksl01")); //senha Fraca
        System.out.println("----------------");
        System.out.println(ClassificarSenha("akdjspdq1d")); //senha Media
        System.out.println("----------------");
        System.out.println(ClassificarSenha("34kals01q1")); //senha Forte
        System.out.println("----------------");
    }


}
