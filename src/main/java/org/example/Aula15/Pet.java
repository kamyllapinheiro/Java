package org.example.Aula15;

public class Pet {

    String nome;
    String especie;
    Double peso;
    String porte;


    String definirPorte(){
        if (peso < 10){
            return "Pequeno";
        } else if (peso >= 10 && peso <= 24) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    void emitirSom() {
        System.out.println(nome + " faz: (som de pet)");
    }

}
