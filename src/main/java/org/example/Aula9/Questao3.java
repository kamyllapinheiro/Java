package org.example.Aula9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {
    static void main(String[] args) {
//        3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.println("Digite um numero:");
//            int idade = sc.nextInt();
//            System.out.println(idade);
//
//        }catch (InputMismatchException e){
//            System.out.println("Esse campo recebe somente numeros inteiros.");
//        }

//        4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
//        try {
//        String nome= null;
//        System.out.println(nome.length());
//        }catch (NullPointerException e){
//            System.out.println("O nome não foi preenchido.");
//        }


//        5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

//        try {
//            System.out.println("Digite um numero:");
//            int num = sc.nextInt();
//            System.out.println(100 % num);
//        } catch (ArithmeticException e){
//            System.out.println("Não pode dividir por 0.");
//        }

//        6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
        try {
        String[] nomes = {"Kamy", "Maria", "Ana"};

        System.out.println(nomes[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe.");
        }
        System.out.println("O programa continua funcionando.");








    }
}
