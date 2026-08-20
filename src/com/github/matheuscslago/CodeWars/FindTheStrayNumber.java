package com.github.matheuscslago.CodeWars;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        if (numbers[0] != numbers[1]) {
            return numbers[0] == numbers[2] ? numbers[1] : numbers[0];
        }
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != numbers[0]) {
                return numbers[i];
            }
        }
        return 0;
    }
}
