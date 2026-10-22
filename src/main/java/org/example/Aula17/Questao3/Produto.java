//package org.example.Aula17.Questao3;
//
//public class Produto {
//    /*
//Questão 3: Getters e Setters
//Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).
//
//Crie getters e setters para todos os atributos.
//O setter de preco não deve aceitar valores menores ou iguais a zero.
//O setter de quantidade não deve aceitar valores negativos.
//No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.
// */
//    private String nome;
//    private double preco;
//    private int quantidade;
//
//    public String getNome(){
//        return nome;
//    }
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//    public double getPreco(){
//        return preco;
//    }
//    public void setPreco(double preco){
//        if (preco <=0){
//            System.out.println("Valor inválido");
//        } else {
//            this.preco = preco;
//        }
//    }
//    public int getQuantidade(){
//        return quantidade;
//    }
//    public int setQuantidade(){
//        if (quantidade <0){
//            System.out.println("Valor inválido");
//        }
//    }
//
//
//
//
//
//}
