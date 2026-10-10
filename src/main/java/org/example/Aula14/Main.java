package org.example.Aula14;
//1. Crie a classe Pessoa com os atributos nome e idade, e o método
//   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
//
//   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
//
//   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
//
//   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
//   e os três funcionaram.
public class Main{
    public static void main(String[] args) {
        Aluna dados = new Aluna();
        dados.nome = "Kamy";
        dados.idade = 23;
        dados.curso = "Programação";
        System.out.println("Oi, sou " + dados.nome + " e tenho " + dados.idade + " anos.");
        dados.estudar();

        Aluna nova = new Aluna();

        Professora nova1 = new Professora();




    }
}
