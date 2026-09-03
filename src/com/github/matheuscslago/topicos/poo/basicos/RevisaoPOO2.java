package com.github.matheuscslago.topicos.poo.basicos;

public class RevisaoPOO2 {
    static void main(String[] args) {
        Item item1 = new Item("Lacerating Sword", "Legendary", 85);
        Item item2 = new Item("Wood Axe", 50);
        Hero hero1 = new Hero("Mike Wheeler", item1);
        Hero hero2 = new Hero("Dustin Henderson", item2);

        System.out.println("======Test Attack======");
        hero1.attack();
        System.out.println("\n--------Change Weapon--------");
        hero1.switchWeapon(item2);
        hero1.attack();
        System.out.println("\n=============================\n");

        Guild guild = new Guild("Stranger Things");
        guild.recruit(hero1);
        guild.recruit(hero2);
        System.out.println("\n======Show Guild======");
        guild.viewGuild();

        System.out.println("\n======View Total Items======");
        System.out.println("Total items created: " + Item.getTotalItems());
    }
}

class Item {
    private String name;
    private String rarity;
    private int baseDamage;
    private static int totalItems = 0;

    public Item(String name, String rarity, int baseDamage) {
        this.name = name;
        this.rarity = rarity;
        this.baseDamage = baseDamage;
        totalItems++;
    }

    public Item(String name, int baseDamage) {
        this(name, "Common", baseDamage);
    }

    public String getDescription() {
        String description = "<" + this.name + "> [" + this.rarity + "] | Damage: <" + this.baseDamage + ">";
        return description;
    }

    public static int getTotalItems() {
        return totalItems;
    }
}

class Hero {
    private String nickname;
    private Item weapon;

    public Hero(String nickname, Item weapon) {
        this.nickname = nickname;
        this.weapon = weapon;
    }

    public void switchWeapon(Item newWeapon) {
        this.weapon = newWeapon;
    }

    public void attack() {
        System.out.print("<" + this.nickname + "> attacked using: " + weapon.getDescription());
    }

    public void description() {
        System.out.print(this.nickname + " | Weapon equipped: " + this.weapon.getDescription() + "\n");
    }

    public String getNickname() {
        return nickname;
    }
}

class Guild {
    private String name;
    private Hero[] members = new Hero[3];
    private int numberMembers = 0;

    public Guild(String name) {
        this.name = name;
    }

    public void recruit(Hero hero) {
        if (numberMembers < members.length) {
            members[numberMembers] = hero;
            System.out.println(hero.getNickname() + " joined the guild: " + this.name);
            numberMembers++;
        } else {
            System.out.println("[System Error]: The guild is already full!");
        }
    }

    public void viewGuild() {
        int i = 0;
        System.out.println("Guild Name: " + this.name);
        for(Hero member: members){
            if(member != null){
                System.out.print("Member[" + (i + 1) + "]: ");
                member.description();
                i++;
            }
        }

        System.out.println("====================");
    }

}
