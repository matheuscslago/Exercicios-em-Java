package com.github.matheuscslago.topicos.classesutilitarias.strings;

public class LimpezaString {
    private String logBruta;

    public LimpezaString(String logBruta) {
        if (logBruta == null) {
            throw new IllegalArgumentException("Não pode ser nula");
        }
        this.logBruta = logBruta;
    }

    public String limpar() {
        return this.logBruta.trim().replace("_", " ");
    }

    public void extracao(String logLimpa){
        if (logLimpa == null) {
            throw new IllegalArgumentException("String nula!");
        }
        if(logLimpa.contains("Critica")){
            System.out.println("[Alerta] Ocorrência de falha crítica!");
        }

        int ultimoIndice = logLimpa.lastIndexOf("-");
        String codigo = logLimpa.substring(ultimoIndice + 1);
        System.out.println("Código do erro: " + codigo);
    }

    public String reverter(StringBuilder sb){
        if(!(sb == null) && !sb.isEmpty()){
            String normal = sb.reverse().toString();
            return normal;
        }else{
            throw new IllegalArgumentException("String Invalida!");
        }
    }

    public String getLogBruta() {
        return logBruta;
    }
}
