package com.github.matheuscslago.desafios.bootcampjava;
import java.util.Scanner;

public class ValidacaoOperacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean operacaoValida = false;
        String operacao = scanner.nextLine();

        if(operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")){
            operacaoValida = true;
        }

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}
