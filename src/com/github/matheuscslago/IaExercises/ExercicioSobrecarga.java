package com.github.matheuscslago.IaExercises;

public class ExercicioSobrecarga {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        System.out.println("--- Testando Sobrecargas de Notificação ---\n");
        notificador.enviarMensagem("Servidor em manutenção às 23h.");
        notificador.enviarMensagem("Matheus", "Seu relatório está pronto.");
        notificador.enviarMensagem("Lucas", "Falha de conexão no banco!", 1);
    }
}

class Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("[GERAL]: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Para <" + destinatario + ">: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem, int prioridade) {
        System.out.println("[Prioridade " + prioridade + "] Para<" + destinatario + ">: " + mensagem);
    }
}
