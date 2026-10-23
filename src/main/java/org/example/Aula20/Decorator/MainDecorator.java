package org.example.Aula20.Decorator;

public class MainDecorator {
    static void main(String[] args) {

        //So cafe puro
        Cafe pedido1 = new CafeSimples();

        System.out.println("Pedido 1: " + pedido1.getDescricao() + " = R$"  + pedido1.getPreco());

        //Cafe com leite
        Cafe pedido2 = new ComLeite(new CafeSimples());
        System.out.println("Pedido 2: " + pedido2.getDescricao() + " = R$" + pedido2.getPreco());

        //Cafe com leite e chocolate
        Cafe pedido3 = new ComChocolate(new ComLeite(new CafeSimples()));
        System.out.println("Pedido 3: " + pedido3.getDescricao() + " = R$" + pedido3.getPreco());

        //Cafe com chocolate e leite
        Cafe pedido4 = new ComLeite(new ComChocolate(new CafeSimples()));
        System.out.println("Pedido 4: " + pedido4.getDescricao() + " = R$" + pedido4.getPreco());

    }
}
