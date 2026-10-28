package com.github.matheuscslago.topicos.classesutilitarias.strings;

public class MainString {
    static void main(String[] args) {
        LimpezaString limpezaString = new LimpezaString("   [ATENCAO]-Planeta_Vegeta-Invasao_Saiyajin-9001   ");

        System.out.println("=== teste 1 ===");
        System.out.println(limpezaString.limpar());
        limpezaString.extracao(limpezaString.limpar());
        System.out.println(limpezaString.reverter(new StringBuilder("sodaD ed adatnE")));
    }
}
