/*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
 */
package org.example.Aula9;

import java.util.Scanner;

public class questão2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int[] notas = {5, 10, 4, 7,9};
        int posicao = sc.nextInt();
        System.out.println(notas[posicao]);

        }  catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("O Array vai somente de 0 a 4.");
        }

    }
}
