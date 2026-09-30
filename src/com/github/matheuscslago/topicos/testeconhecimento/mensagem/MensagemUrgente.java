package com.github.matheuscslago.topicos.testeconhecimento.mensagem;

public class MensagemUrgente extends Mensagem{
    public MensagemUrgente(double custo, String remetente) {
        super(custo, remetente);
    }

    @Override
    public double custoTotal() {
        return getCusto() + 5.0;
    }
}
