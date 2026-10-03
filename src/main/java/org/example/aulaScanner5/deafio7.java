package org.example.aulaScanner5;

import java.util.Scanner;

public class deafio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        opcao = sc.nextInt();
        while (opcao!=2) {
            if (opcao == 2){
                break;
            }
            switch (opcao){
                case 1:
                    Aluna aluna = new Aluna();
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }
}
