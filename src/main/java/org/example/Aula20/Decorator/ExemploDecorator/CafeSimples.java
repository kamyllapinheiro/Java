package org.example.Aula20.Decorator.ExemploDecorator;

public class CafeSimples implements Cafe {

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
