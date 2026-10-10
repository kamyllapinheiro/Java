package org.example.Aula15;

import java.util.Scanner;

public class Petshop extends Pet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet[] petLista = new Pet[5];

        int total = 0;
        int opcao = -1;
//        Pet meuPet = new Pet();
//
//        System.out.println("Escreva o nome do pet:");
//        meuPet.nome = sc.nextLine();
//
//        System.out.println("Escreva a especie do pet:");
//        meuPet.especie = sc.nextLine();
//
//        System.out.println("Escreva o peso do pet:");
//        meuPet.peso = sc.nextDouble();
//        sc.nextLine();
//
//        meuPet.porte = meuPet.definirPorte();
//
//        System.out.println("--- PETS CADASTRADOS ---");
//        System.out.printf("Nome: %s \nEspecie: %s\nPeso: %.2f \nPorte: %s\n", meuPet.nome, meuPet.especie, meuPet.peso, meuPet.porte);

//        Pet[] petLista = new Pet[5];
//
//        petLista[0]= meuPet;

//        System.out.printf("%s (%s) - %.2f kg - Porte %s\n", meuPet.nome, meuPet.especie, meuPet.peso, meuPet.porte);


        while (opcao != 0){

            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

        switch (opcao){

            case 1:
                Pet meuPet = new Pet();

                System.out.println("Escreva o nome do pet:");
                meuPet.nome = sc.nextLine();

                System.out.println("Escreva a especie do pet:");
                meuPet.especie = sc.nextLine();

                System.out.println("Escreva o peso do pet:");
                meuPet.peso = sc.nextDouble();
                sc.nextLine();

                meuPet.porte = meuPet.definirPorte();

                petLista[total] = meuPet;
                total++;




//                System.out.println("--- PETS CADASTRADOS ---");
//                System.out.printf("Nome: %s \nEspecie: %s\nPeso: %.2f \nPorte: %s\n", meuPet.nome, meuPet.especie, meuPet.peso, meuPet.porte);




//                Pet novoPet = new Pet();
//
//                System.out.println("Escreva o nome do pet:");
//                novoPet.nome = sc.nextLine();
//
//                System.out.println("Escreva a especie do pet:");
//                novoPet.especie = sc.nextLine();
//
//                System.out.println("Escreva o peso do pet:");
//                novoPet.peso = sc.nextDouble();
//                sc.nextLine();
//
//                novoPet.porte = novoPet.definirPorte();






                System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                break;

            case 0:
                System.out.println("Até logo!");
                break;

            default:
                System.out.println("Opção inválida.");
             }

        }

    }
}
