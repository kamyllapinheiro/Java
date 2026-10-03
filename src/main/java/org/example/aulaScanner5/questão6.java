/*6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."

 */

package org.example.aulaScanner5;

import java.util.Scanner;

public class questão6 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + ano);

    }
}
