package org.example.Aula23.Lambda1;

import org.example.Aula23.Lambda2.Acao;
import org.example.Aula23.Lambda2.Operacao;

public class Main {
    public static void main(String[] args) {

        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        Impressora imprimirMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        Impressora imprimirMinusculo = (texto) -> System.out.println(texto.toLowerCase());

        imprimirMaiusculo.imprimir("Bom dia!");
        imprimirMinusculo.imprimir("Bom dia!");

        Calculo calculoSoma = (a, b) -> a + b;
        Calculo calculoMultiplicacao = (a, b) -> a * b;
        Calculo maiorQue = (a, b) -> Math.max(a, b);

        System.out.println(calculoSoma.calcular(3,4));
        System.out.println(calculoMultiplicacao.calcular(3,4));
        System.out.println(maiorQue.calcular(3,4));

        mostrarResultado(n -> n * 2, 5);
        mostrarResultado(n -> n * n, 5);
        mostrarResultado(n -> -n, 5);


        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));

        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));



    }

    //Antes eu guardava a ação e chamava. Agora eu entrego a ação e deixo o metodo decidir o que fazer com ela.

    //Interface Acao com void executar().
    //Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
    //No main, chame repetir passando uma lambda que imprime "oi".
    //Repare que você não cria variável, a lambda vai direto como argumento.
    public static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    public static void mostrarResultado(Operacao op, int valor) {

       System.out.println(op.aplicar(valor));

    }

    public static void executarSe(Condicao cond, int valor, Acao acao) {

        if (cond.testar(valor)) {
            acao.executar();
        }

    }

}
