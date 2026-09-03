package com.github.matheuscslago.desafios.codewars;

public class LoveVsFriendship {
    public static int wordsToMarks(String text) {
        int value = 0;
        for (char letter : text.toCharArray()) {
            value += letter - 'a' + 1;
        }
        return value;
    }
}
