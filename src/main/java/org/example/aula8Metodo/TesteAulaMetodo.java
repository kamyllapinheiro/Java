package org.example.aula8Metodo;


public class TesteAulaMetodo {
    public static int numero = 0;

    static void saudacaoo() {
        System.out.println("oiiiiii");
    }

    static int soma(int n1, int n2, int n3) {
        int resultado = n1 + n2;
        return n1 + n2 + n3;
    }

    // 1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");


    }
}
