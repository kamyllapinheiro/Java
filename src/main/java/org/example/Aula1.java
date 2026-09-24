package org.example;

/**
 *Crie variáveis para receber os seguintes dados:
 * -Nome
 * -Idade
 * -Altura
 * -CEP
 * -Se a pessoa é fumante
 * -Cidade onde mora
 * -Peso
 * -Telefone
 * -Se tem carteira de motorista
 * -Profissão
 * -Ano de nascimento
 * -Temperatura
 * -Nota
 *
 * Ps: Sigam o padrão de nomenclatura, por exemplo:
 * anoNascimento,
 * estaVacinado...
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula1 {
    public static void main(String[] args) {


        String nome = "Kamylla";
        String cidade = "Teresópolis";
        String profissao = "Analista de Sistemas";
        String telefone = "(21)9-9999-9999";
        String cep  = "22222-222";

        int idade = 23;
        int anoNascimento = 2003;
        int temperatura = 25;

        double altura = 1.63;
        double peso = 74.40;
        double nota = 9.99;

        boolean eFumante = false;
        boolean temCNH = true;

        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Idade: %s anos. \n", idade);
        System.out.printf("Altura: %.2f \n", altura);
        System.out.printf("Cep: %s \n", cep);
        System.out.printf("Cidade: %s \n", cidade);
        System.out.printf("Peso: %s \n", peso);
        System.out.printf("É fumante: %s \n", eFumante);
        System.out.printf("Telefone: %s \n", telefone);
        System.out.printf("Carteira de Motorista: %s \n", temCNH);
        System.out.printf("Profissão: %s \n", profissao);
        System.out.printf("Ano de nascimento: %d \n", anoNascimento);
        System.out.printf("Temperatura: %dºC \n", temperatura);
        System.out.printf("Nota: %.2f \n", nota);


    }
}