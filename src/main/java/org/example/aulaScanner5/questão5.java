/*5 - Crie uma classe chamada Produto com os atributos nome (aulaStrings) e preco (double).

Na classe principal, faça um laço for que repita 3 vezes.

A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um Produto.

Instancie um novo Produto e guarde nele os valores digitados.

Logo em seguida, faça um if: se o preço do Produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

 */
//
//
//package org.example.aulaScanner5;
//
//import java.util.Scanner;
//
//public class questão5 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String descricao = "";
//
//
//        for (int i = 1; i <= 3; i++) {
//            Produto novoProduto = new Produto();
//            System.out.println("Insira o nome do produto: ");
//
//            novoProduto.nome = sc.nextLine();
//            System.out.println("insira o valor do produto: ");
//            novoProduto.preco = sc.nextLine();
//            sc.nextLine();
//            if (novoProduto.preco > 100) {
//                System.out.println("O produto %s tem o valor de %.2f. Produto caro!", novoProduto.preco);
//            } else {
//                System.out.println("O produto %s tem o valor de %.2f. Produto com preço acessível! \n", novoProduto.nome, novoProduto.preco);
//
//
//
//
//        }
//    }
//}