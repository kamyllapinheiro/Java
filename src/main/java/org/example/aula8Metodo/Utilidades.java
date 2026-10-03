package org.example.aula8Metodo;

public class Utilidades {

    //2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
    static void saudar(String nome) {
        System.out.println("Olá " + nome + "! Tudo bem?");
    }

    //3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
    static int dobro(int numero) {
        return numero * 2;
    }

    //4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    //5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    //     6 — Crie três métodos com o mesmo nome somar:
//
//        um que recebe dois inteiros
//        um que recebe três inteiros
//        um que recebe dois decimais
//
//        No main, chame os três e veja o Java escolher sozinho qual usar.

    static int somar(int somar1, int somar2) {
        return somar1 + somar2;
    }

    static int somar(int somar3, int somar4, int somar5) {
        return somar3 + somar4 + somar5;
    }

    static double somar(double decimal1, double decimal2) {
        return decimal1 + decimal2;
    }

    //7 — Crie dois métodos chamados saudacao:
    //
    //um sem parâmetro, que imprime "Olá!"
    //um que recebe um nome, e imprime "Olá, [nome]!"

    static void saudacao (){
        System.out.println("Olá!");
    }
    static void saudacao (String nome){
        System.out.println("Olá, " + nome+ "!");
    }

}

