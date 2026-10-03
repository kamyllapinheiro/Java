package org.example.aula8Metodo;

import java.util.Scanner;

import static org.example.aula8Metodo.TesteAulaMetodo.*;
import static org.example.aula8Metodo.Utilidades.*;

public class AulaMetodos {
    public static void main(String[] args) {

        // 1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
//       mostrarBoasVindas();




//        //2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
//        saudar ("Kamy");
//        saudar ("Ana");
//        saudar ("Lara");
//
//        //3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
//        System.out.println(dobro(10));

            //4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.


            Scanner sc = new Scanner(System.in);
//        double n1 = 0;
//        double n2 = 0;

//            double n1 = sc.nextDouble();
//            double n2 = sc.nextDouble();
//        System.out.printf("Média: %.2f",calcularMedia(n1, n2));

        //5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
//        System.out.println("Digite a sua idade: ");
//        int idade = sc.nextInt();
//
//        if (ehMaiorDeIdade(idade)){
//            System.out.println("Você é maior de idade!");
//        } else {
//            System.out.println("Você é menor de idade!");
//        }

//        6 — Crie três métodos com o mesmo nome somar:
//
//        um que recebe dois inteiros
//        um que recebe três inteiros
//        um que recebe dois decimais
//
//        No main, chame os três e veja o Java escolher sozinho qual usar.
//        System.out.println(somar(5,6));
//        System.out.println(somar(10, 20, 30));
//        System.out.println(somar(2.5, 5.5));

        //7 — Crie dois métodos chamados saudacao:
        //
        //um sem parâmetro, que imprime "Olá!"
        //um que recebe um nome, e imprime "Olá, [nome]!"

        saudacao();
        saudacao("Kamy");

    }

}








