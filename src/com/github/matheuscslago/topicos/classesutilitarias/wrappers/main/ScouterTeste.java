package com.github.matheuscslago.topicos.classesutilitarias.wrappers.main;


import com.github.matheuscslago.topicos.classesutilitarias.wrappers.exceptions.PoderInvalidoException;
import com.github.matheuscslago.topicos.classesutilitarias.wrappers.service.ScouterProcessor;

public class ScouterTeste {
    static void main(String[] args) {

        System.out.println("=== Leitura 1 ===");
        try{
            ScouterProcessor scouterProcessor = new ScouterProcessor();
            scouterProcessor.processarLeitura("Goku", "8000", "Saiyajin");
        }catch (IllegalArgumentException | PoderInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("--- Varredura do Scouter Finalizada ---\n");
        }

        System.out.println("=== Leitura 2 ===");
        try{
            ScouterProcessor scouterProcessor = new ScouterProcessor();
            scouterProcessor.processarLeitura("Vegeta", "-8000", "Saiyajin");
        }catch (IllegalArgumentException | PoderInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("--- Varredura do Scouter Finalizada ---\n");
        }

        System.out.println("=== Leitura 1 ===");
        try{
            ScouterProcessor scouterProcessor = new ScouterProcessor();
            scouterProcessor.processarLeitura("Piccolo", "8000", "namekuseijin");
        }catch (IllegalArgumentException | PoderInvalidoException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("--- Varredura do Scouter Finalizada ---\n");
        }
    }
}
