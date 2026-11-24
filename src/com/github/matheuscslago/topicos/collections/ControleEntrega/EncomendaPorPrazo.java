package com.github.matheuscslago.topicos.collections.ControleEntrega;

import java.util.Comparator;

public class EncomendaPorPrazo implements Comparator<Encomenda> {
    @Override
    public int compare(Encomenda o1, Encomenda o2) {
        return Integer.compare(o1.getPrazoDias(), o2.getPrazoDias());
    }
}
