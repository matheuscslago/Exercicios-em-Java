package com.github.matheuscslago.topicos.poo.heranca;

public class Desenvolvedor extends Funcionario {
    private int deliveredProjects;

    public Desenvolvedor(String name, double baseSalary, int deliveredProjects) {
        super(name, baseSalary);
        this.deliveredProjects = deliveredProjects;
    }

    @Override
    public double bonus(){
        return super.bonus() + (this.deliveredProjects * 200.0);
    }
}
