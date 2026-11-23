package com.github.matheuscslago.topicos.collections.ControleEntrega.domain;

import java.util.Comparator;

public class EncomendaPorPeso implements Comparator<Encomenda> {
    @Override
    public int compare(Encomenda o1, Encomenda o2) {
        return Double.compare(o1.getPesoKg(), o2.getPesoKg());
    }
}
