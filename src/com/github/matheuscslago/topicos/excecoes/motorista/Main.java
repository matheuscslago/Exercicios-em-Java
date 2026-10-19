package com.github.matheuscslago.topicos.excecoes.motorista;

public class Main {
    static void main(String[] args) {
        ValidadorCarteira carteira = new ValidadorCarteira();

        System.out.println("test 1");
        try{
            carteira.verificarIdade(18);
        }
        catch(RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }

        System.out.println("test 2");
        try{
            carteira.verificarIdade(10);
        }
        catch(RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }

        System.out.println("test 3");
        try{
            carteira.verificarIdade(121);
        }
        catch(RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }
    }
}
