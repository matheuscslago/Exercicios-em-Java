package com.github.matheuscslago.IaExercises.Revisao;

public class RevisaoPOO {
    static void main(String[] args) {

    }
}

class Game {
    private String id;
    private String name;
    private double price;
    private String category;
    private static int totalGames = 0;

    static {
        System.out.println("[System]: Initializing catalog...");
    }
    {
        totalGames++;
        id = ("GAME-100"+totalGames);
    }
    public Game(String name, double price, String category){
        if(price >= 0){
            this.price = price;
        }
        else{
            System.out.println("Invalid Price [value < 0] <Setting to 0.0...>");
            this.price = 0.0;
        }
        this.name = name;
        this.category = category;
    }
    public Game(String name, double price){
        this(name, price, "General");
    }

    public double discountApply(double percent){
        double percentage = (percent / 100.0) * this.price;
        this.price -= percentage;
        return this.price;
    }

    public double discountApply(double percent, double coupon){
        this.price = discountApply(percent) - coupon;
        return this.price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public static int getTotalGames() {
        return totalGames;
    }
}
