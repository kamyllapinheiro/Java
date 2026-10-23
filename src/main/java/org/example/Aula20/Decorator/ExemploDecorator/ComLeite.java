package org.example.Aula20.Decorator.ExemploDecorator;

public class ComLeite extends CafeDecorator {

    public ComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + leite ";
    }

    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 2.00;
    }
}
