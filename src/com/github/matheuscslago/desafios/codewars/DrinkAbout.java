package com.github.matheuscslago.desafios.codewars;

public class DrinkAbout {
    public static String peopleWithAgeDrink(int age){
        if(age >= 21){
            return "drink whisky";
        }
        else if(age < 21 && age >= 18){
            return "drink beer";
        }
        else if(age < 18 && age >= 14){
            return "drink coke";
        }
        else{
            return "drink toddy";
        }
    }
}
