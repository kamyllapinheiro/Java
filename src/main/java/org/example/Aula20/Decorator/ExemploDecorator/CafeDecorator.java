package org.example.Aula20.Decorator.ExemploDecorator;

abstract class CafeDecorator implements Cafe {
    protected  Cafe cafeEmbrulhado;

    public CafeDecorator(Cafe cafe) {
        this.cafeEmbrulhado = cafe;
    }

}
