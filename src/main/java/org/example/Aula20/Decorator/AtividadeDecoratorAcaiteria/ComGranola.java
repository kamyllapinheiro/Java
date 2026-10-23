package org.example.Aula20.Decorator.AtividadeDecoratorAcaiteria;

import org.example.Aula20.Decorator.ExemploDecorator.Cafe;

public class ComGranola extends AcaiDecorator {
    public ComGranola(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola ";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 1.0;
    }
}
