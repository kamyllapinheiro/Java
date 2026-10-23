package org.example.Aula20.Decorator.AtividadeDecoratorAcaiteria;

public class MainAcai {
    static void main(String[] args) {

    // açaí só com granola
        Acai pedido1 = new ComGranola(new AcaiSimples());
        System.out.println("Pedido 1: " + pedido1.getDescricao() + " = R$"  + pedido1.getPreco());

        // açaí com granola e morango
        Acai pedido2 = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println("Pedido 2: " + pedido2.getDescricao() + " = R$"  + pedido2.getPreco());

    }
}
