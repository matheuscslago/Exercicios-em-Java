package com.github.matheuscslago.Exercises.Revisao.Heranca;

public class Gerente extends Funcionario{
    private double leadershipBonus;

    public Gerente(String name, double baseSalary, double leadershipBonus){
        super(name, baseSalary);
        this. leadershipBonus = leadershipBonus;
    }

    @Override
    public double bonus(){
        return super.bonus() + this.leadershipBonus;
    }
}
