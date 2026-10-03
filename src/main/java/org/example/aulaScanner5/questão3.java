/*
3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
*/

package org.example.aulaScanner5;

import java.util.Scanner;

public class questão3 {
    public static void main(String[] args) {
        int opcao= 0;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 :
                    System.out.println("Opção 1 confirmada. \n");
                    break;
                case 2:
                    System.out.println("Opção 2 confirmada. \n");
                    break;
                case 3:
                    System.out.println("Operação finalizada. \n");
                    break;
                default:
                    System.out.println("Opção invalida! \n");
            }
        } while ( opcao != 3);
    }
}
