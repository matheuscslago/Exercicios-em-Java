package com.github.matheuscslago.Exercises.Revisao;

public class RevisaoPOO1 {
    static void main(String[] args) {
        // Testando a execução
        Game game1 = new Game("Need for Speed", 200.0, "Corrida");
        Game game2 = new Game("Minecraft", 90.0); // Categoria padrão "Geral"

        // Testando Sobrecarga de Métodos
        game1.discountApply(10.0); // 10% de desconto
        game2.discountApply(10.0, 15.0); // 10% + R$ 15 fixos

        // Testando Associação
        Player player = new Player("LagoPlayer", game1);
        player.viewProfile();

        System.out.println("\nTotal de jogos cadastrados no sistema: " + Game.getTotalGames());
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

class Player{
    private String nickname;
    private Game favoriteGame;

    public Player(String nickname, Game favoriteGame) {
        this.nickname = nickname;
        this.favoriteGame = favoriteGame;
    }

    public void viewProfile(){
        System.out.println("\n--- PERFIL DO JOGADOR ---");
        System.out.println("Nickname: " + nickname);
        System.out.println("Jogo Favorito: " + favoriteGame.getName()
                + " [" + favoriteGame.getCategory() + "]"
                + " | ID: " + favoriteGame.getId()
                + " | Preço: R$ " + favoriteGame.getPrice());
    }
}