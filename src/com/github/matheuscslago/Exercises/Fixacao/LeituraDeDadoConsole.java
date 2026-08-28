package com.github.matheuscslago.Exercises.Fixacao;

import java.util.Scanner;

public class LeituraDeDadoConsole {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Gold: ");
        double gold = input.nextDouble();

        input.close();

        System.out.println("===View Information===");
        System.out.println("Your Name = " + name);
        System.out.println("Your Age = " + age);
        System.out.println("Your Gold = " + gold);
    }
}
