/*
1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais. Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
*/
/*
1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
package org.example.aulaScanner5;

 */

import java.util.Scanner;

public class questão1 {
    public static void main(String[] args) {
        String lanche = "";

        double desconto = 5.0;
        double valorLanche = 0;
        double resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do lanche:");
        lanche = sc.nextLine();

        System.out.println("Agora o valor:");
        valorLanche = sc.nextDouble();

        sc.close();

        if (valorLanche > 30.00) {
            resultado = valorLanche - desconto;
            System.out.printf("Você ganhou um desconto de %.2f \n", desconto);
            System.out.printf("O seu %s custa R$ %.2f", lanche, resultado);
        }
        else {
            System.out.printf("O seu %s custa R$ %.2f", lanche, valorLanche);
        }


    }
}
