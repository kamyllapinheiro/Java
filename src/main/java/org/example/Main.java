package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Kamylla";
        int idade = 23;
        double altura = 1.63;
        int cep  = 25025252;
        String cidade = "Teresópolis";
        double peso = 74.40;
        boolean eFumante = false;
        int telefone = 21999999;
        boolean temCNH = true;
        String profissao = "Analista de Sistemas";
        int anoNascimento = 2003;
        int temperatura = 25;
        double nota = 9.99;


        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Idade: %s anos. \n", idade);
        System.out.printf("Altura: %.2f \n", altura);
        System.out.printf("Cep: %s \n", cep);
        System.out.printf("Cidade: %s \n", cidade);
        System.out.printf("Peso: %s \n", peso);
        System.out.printf("É fumante: %s \n", eFumante);
        System.out.printf("Telefone: %d \n", telefone);
        System.out.printf("Carteira de Motorista: %s \n", temCNH);
        System.out.printf("Profissão: %s \n", profissao);
        System.out.printf("Ano de nascimento: %d \n", anoNascimento);
        System.out.printf("Temperatura: %dºC \n", temperatura);
        System.out.printf("Nota: %.2f \n", nota);

    }
}