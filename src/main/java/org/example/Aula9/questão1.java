/*
1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
 */


package org.example.Aula9;

import java.util.Scanner;

public class questão1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int numero1 = sc.nextInt();
            System.out.println("Digite outro número: ");
            int numero2 = sc.nextInt();
            System.out.println(numero1 / numero2);

        } catch (ArithmeticException e){
            System.out.println("Não pode dividir por 0");
            System.out.println(e);
        } finally {
        }


    }
}
