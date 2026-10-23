package org.example.Aula20.Decorator.ExemploDecorator;

public class ComChocolate extends CafeDecorator {

    public ComChocolate(Cafe cafe) {

        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + Chocolate";
    }
    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 3.50;
    }
}
