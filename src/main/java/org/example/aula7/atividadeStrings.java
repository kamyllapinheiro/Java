package org.example.aula7;

import java.util.Scanner;

public class atividadeStrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        System.out.println("Informe o seu nome completo:");
        String nome = sc.nextLine();
        System.out.println(nome.length());

//       //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        System.out.println("Informe o seu nome completo:");
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

//        //3 — Peça o nome da pessoa e mostre a primeira letra dele.
        System.out.println("Informe o seu nome completo:");
        String nome1 = sc.nextLine();
        System.out.println(nome.charAt(0));

        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        String frase = "";
        System.out.println("Digite uma frase:");
        frase = sc.nextLine();


        String palavra = "";
        System.out.println("Digite uma palavra:");
        palavra = sc.nextLine();

        System.out.println(frase.contains(palavra));

        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        String nomeMinu = "";
        String nomeMaiu = "";
        System.out.println("Escreva o seu nome:");
        nomeMinu = sc.nextLine();
        System.out.println("Escreva novamente");
        nomeMaiu = sc.nextLine();
        System.out.println(nomeMinu.equalsIgnoreCase(nomeMaiu));















    }
}
