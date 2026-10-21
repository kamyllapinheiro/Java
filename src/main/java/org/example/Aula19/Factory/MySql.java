package org.example.Aula19.Factory;

import org.example.Aula19.Interfaces.BancoDeDados1;

public class MySql implements BancoDeDados {

    String pessoa;
    int numero;

    @Override
    public void proibidoBarulhoAposDezHoras() {
        System.out.println("Barulho MySql");
    }

    @Override
    public void getNumero() {
    }

    @Override
    public void chamarBanco() {
    }
}
