package org.example.Aula19.Factory;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao){
        if (opcao == 1){
            return new MySql();
        } else if ( opcao == 2) {
            return new MongoDb();
        } else {
            throw new IllegalArgumentException("Opçao inválida");
        }

    }
}
