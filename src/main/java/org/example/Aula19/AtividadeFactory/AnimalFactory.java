package org.example.Aula19.AtividadeFactory;

public class AnimalFactory {


    // Esse método é o atendente da fábrica
    public Animal getAnimal(String tipo){
        if (tipo.equalsIgnoreCase("cachorro")){
            return new CachorroFactor();
        } else if (tipo.equalsIgnoreCase("Gato")) {
            return new GatoFactor();
        } throw new IllegalArgumentException("Opção inválida");
    }

}
