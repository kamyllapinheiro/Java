package org.example.Aula16;

public class Encapsulamento {
    static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());

        c.setTitular("");
        c.setTitular("Ana");

    }

}
