package org.example.Aula19.Factory;

import org.example.Aula19.Interfaces.BancoDeDados1;

public class MongoDb implements BancoDeDados {

    String pessoa;
    public void proibidoBarulhoAposDezHoras() {
        System.out.println("Barulho MongoDb");
    }

    @Override
    public void getNumero() {
    }

    @Override
    public void chamarBanco() {
    }
}
