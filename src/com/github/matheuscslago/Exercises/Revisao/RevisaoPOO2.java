package com.github.matheuscslago.Exercises.Revisao;

public class RevisaoPOO2 {
    static void main(String[] args) {

    }
}

class Item {
    private String name;
    private String rarity;
    private int baseDamage;
    private static int totalItems;

    public Item(String name, String rarity, int baseDamage) {
        this.name = name;
        this.rarity = rarity;
        this.baseDamage = baseDamage;
    }

    public Item(String name, int baseDamage) {
        this(name, "Common", baseDamage);
    }

    public void getDescription() {
        System.out.println("<" + this.name + "> [" + this.rarity + "] | Damage: <" + this.baseDamage + ">");
    }


}
