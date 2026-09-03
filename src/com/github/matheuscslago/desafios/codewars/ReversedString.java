package com.github.matheuscslago.desafios.codewars;

public class ReversedString {
    public static String solution(String str) {
        char[] reversedStr = new char[str.length()];
        char[] normalStr = str.toCharArray();
        int i = 0;

        for(char letter : normalStr){
            letter = normalStr[str.length() - 1 - i];
            reversedStr[i] = letter;
            i++;
        }

        return new String(reversedStr);
    }
}
