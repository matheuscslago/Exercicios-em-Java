package com.github.matheuscslago.topicos.poo.catalogo;

class Product{
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Book extends Product{
    private String author;
    private int pages;

    public Book(int id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + this.author + '\'' +
                ", pages=" + this.pages +
                '}';
    }
}

class Electronic extends Product{
    private int voltage;
    private int monthlyWarranty;

    public Electronic(int id, String name, double price, int voltage, int monthlyWarranty) {
        super(id, name, price);
        this.voltage = voltage;
        this.monthlyWarranty = monthlyWarranty;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", voltage=" + voltage +
                ", monthlyWarranty='" + monthlyWarranty + '\'' +
                '}';
    }
}



public class Overwrite {
    static void main(String[] args) {
        Product p1 = new Product(100, "Qboa", 25.50);
        Book b1 = new Book(101, "Filosofia Pré-Socrática", 150.00, "Sócrates", 200);
        Electronic e1 = new Electronic(102, "iPhone 18", 5500.00, 144, 14);

        System.out.println(p1);
        System.out.println("------------");
        System.out.println(b1);
        System.out.println("------------");
        System.out.println(e1);
    }
}

