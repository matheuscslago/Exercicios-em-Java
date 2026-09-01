package com.github.matheuscslago.Exercises.Revisao.Heranca;

public class Funcionario {
    protected String name;
    protected double baseSalary;

    public Funcionario(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double bonus(){
        return this.baseSalary * (10/100);
    }

    public void showSummary(){
        System.out.println("Name: " + this.name + " | Base Salary: " + this.baseSalary + " | Bonus: " + bonus());
    }
}
