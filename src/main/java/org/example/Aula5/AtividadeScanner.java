package org.example.Aula5;

import java.util.Scanner;

public class AtividadeScanner {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
//        System.out.println("Digite seu nome:");
//        String nome = sc.nextLine();
//        System.out.println("Digite a sua idade:");
//        int idade = sc.nextInt();
//        System.out.println("Olá " + nome + " você tem " + idade + " anos e vai fazer " + (idade + 1) + "no próximo aniversário." );

       // 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
//        System.out.println("Digite um numero inteiro:");
//        int num1 = sc.nextInt();
//        System.out.println("Digite outro numero inteiro:");
//        int num2 = sc.nextInt();
//        System.out.println("A soma é: " + (num1 + num2));
//        System.out.println("A subtração é: " + (num1 - num2));
//        System.out.println("A multiplicação é: " + (num1 * num2));
//        System.out.println("A divisão é: " + (num1 / num2));
//        System.out.println("O resto é: " + (num1 % num2));

        //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

//        System.out.println("digite a sua nota");
//        double notaAlu = sc.nextDouble();
//        if (notaAlu >= 7){
//            System.out.println("Aprovada!");
//        } else if (notaAlu >= 5) {
//            System.out.println("Recuperação!");
//        } else {
//            System.out.println("Reprovada!");
//        }

       // 4 - Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }

    }
}
