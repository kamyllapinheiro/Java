//Crie uma interface BancoDeDados1 que implementa chamarBanco() e getNumero(). Depois classes chamadas Oracle e MySql e Main. MySql e Oracle devem implementar a interface e ter um atributo int numero. chamarBanco() deve retornar uma mensagem de acordo com o banco conectado, e getNumero deve retornar o numero.
//
//Exemplo:
//
//O Banco conectado é o MySql.
//
//Na sua Main crie um método conectarBanco() para receber um dos bancos e dentro dele chamar o método chamarBanco() .



package org.example.Aula19.Factory;

import org.example.Aula19.Interfaces.BancoDeDados1;

import java.util.Scanner;

public class Main {
   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual banco deseja utilizar? Digite: \n 1 - MySql \n 2 - MongoDb");
        int opcao = sc.nextInt();
        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
        banco.proibidoBarulhoAposDezHoras();


//        MySql mySql = new MySql();
//        MongoDb mongoDb = new MongoDb();

//        BancoDeDados1 mySql = new MySql();
//        BancoDeDados1 oracle = new Oracle();
//        BancoDeDados1 mongo = new MongoDb();
//
//
//        conectarBanco(MySql);
//    }
////
//    public static void conectarBanco(BancoDeDados1 banco) {
//       banco.chamarBanco();
//        banco.getNumero();
//
   }
}
