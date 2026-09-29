package com.github.matheuscslago.desafios.bootcampjava;
import java.util.Scanner;

public class ValidacaoCodigoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean acesso = false;
        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        if(codigoEsperado.equals(codigoInformado)){
            acesso = true;
        }

        System.out.println(acesso ? "ACESSO LIBERADO" : "ACESSO NEGADO");

        scanner.close();
    }
}
