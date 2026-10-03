package org.example.aula7;

import java.util.Scanner;

public class atividadeArrays {
    public static void main(String[] args) {

        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
//        String[] nomes = {"Kamylla", "Sofia", "Maria", "Ana", "Julia"};
//        System.out.println(nomes[0]);
//        System.out.println(nomes[2]);
//        System.out.println(nomes[4]);


//        //2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
//        int[] notas = {8, 6, 10, 7, 9};
//        for (int i = 0;i < notas.length; i++) {
//            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
//        }
//
//        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
//
            int[] notas = {8, 6, 10, 7, 9};

//            int resultado= 0;
//            for (int i =0;i < notas.length; i++) {
//                resultado = resultado + notas [i];
//            }
//            System.out.println(resultado);
//            System.out.println(resultado / notas.length);

////        4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
            Scanner sc = new Scanner(System.in);
            int [] numeros = new int [5];

            for (int i = 0;i < numeros.length; i++) {

                System.out.println("Escreva 5 numeros.");
                int numero1 = sc.nextInt();
                numeros[i] = numero1;
            }

            for (int i = 4;i >=0; i--) {
                System.out.println(numeros[i]);
            }

        }

    }

