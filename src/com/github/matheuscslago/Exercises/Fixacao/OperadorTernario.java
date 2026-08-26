package com.github.matheuscslago.Exercises.Fixacao;

//restrição: use apenas operador ternário para praticar!

public class OperadorTernario {
    public static double calcularFrete(double valorCompra, boolean ehClienteVip) {
        return ehClienteVip ? 0.0 : (valorCompra >= 100.0 ? 10.0 : 20.0);
    }

    public static String obterStatusPedido(boolean pago, boolean enviado) {
        return pago ? (enviado ? "Enviado" : "Em processamento") : "Aguardando pagamento";
    }

    public static void main(String[] args) {
        System.out.println("--- Testes de Frete ---");
        System.out.println(calcularFrete(50.0, true));   // Esperado: 0.0 (VIP)
        System.out.println(calcularFrete(150.0, false)); // Esperado: 10.0 (Compra >= 100)
        System.out.println(calcularFrete(50.0, false));  // Esperado: 20.0 (Compra < 100)

        System.out.println("\n--- Testes de Status ---");
        System.out.println(obterStatusPedido(false, false)); // Esperado: Aguardando Pagamento
        System.out.println(obterStatusPedido(true, false));  // Esperado: Em Processamento
        System.out.println(obterStatusPedido(true, true));   // Esperado: Enviado
    }
}
