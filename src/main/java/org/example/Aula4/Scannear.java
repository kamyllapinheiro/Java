package org.example.Aula4;

import java.util.Scanner;

public class Scannear {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //1 - Mostre os números de 1 a 30, um por linha, usando for.
//        int numeros = 30;
//        for (int i = 1; i <= numeros; i++){
//            System.out.println(i);
//        }

        //2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".
//        int contagem = 1;
//        for (int i = 10; i >= contagem; i--){
//            System.out.println(i);
//        }

        //3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
//        int i = 1;
//        while (i < 31){
//            System.out.println(i);
//            i ++;
//        }
        //Comparação: O primeiro ele precisa informar o onde começa, a condição e o contador tudo dentro do for.
        //O segundo primeiro informa o inicio e depois dentro do while o aumento do contador e a condição

        //4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

        int numero = 2;
        for (int i = 1; i <= 10; i++)
            System.out.println(i * numero);
    }
}
