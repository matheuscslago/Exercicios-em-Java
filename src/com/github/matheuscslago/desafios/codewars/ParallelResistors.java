package com.github.matheuscslago.desafios.codewars;

public class ParallelResistors {
    public static double resistance(double... n) {
        double total = 0;
        for(double r : n){
            total += (1/r);
        }
        return 1 / total;
    }
}
