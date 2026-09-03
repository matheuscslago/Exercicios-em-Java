package com.github.matheuscslago.topicos.poo.heranca;

public class Funcionario {
    protected String name;
    protected double baseSalary;

    public Funcionario(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double bonus(){
        return this.baseSalary * 0.10;
    }

    public void showSummary(){
        System.out.println("Name: " + this.name + " | Base Salary: " + this.baseSalary + " | Bonus: " + bonus());
    }
}
