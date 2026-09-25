package org.example.aula3;

public class EstruturasdeDecisão {
    public static void main(String[] args) {

        //1- Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
        int idade = 16;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

//        //2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.
        double saldo = 500.00;
        double compra = 600.00;


        if (compra <= saldo) {
            System.out.println("Compra aprovada! Sobrou " + (saldo - compra));
        } else{
            System.out.println( "Saldo insuficiente! Faltou " + (compra - saldo));

        }

          //3 - Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int opcao = 8;

        switch (opcao){
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida.");

       }

        //4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para: precisa ter 18 anos e ter autorização.

        int idade1 = 17;
        boolean temAutorizacao = true;

        if (idade1 >= 18 || temAutorizacao) {
            System.out.println("Acesso liberado");
        }
        else {
            System.out.println("Acesso bloqueado");
        }

        //desafio

        double nota1= 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }



    }
}
