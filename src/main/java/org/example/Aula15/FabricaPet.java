package org.example.Aula15;

public class FabricaPet {

    public static Pet criar(String nome, String especie, double peso) {

        Pet pet;
        if (especie.equalsIgnoreCase("CachorroFactor")) {
            pet = new Cachorro();
        } else if (especie.equalsIgnoreCase("GatoFactor")) {
            pet = new Gato();
        } else {
            pet = new Pet();
        }

        pet.nome = nome;
        pet.especie = especie;
        pet.peso = peso;

        pet.porte = pet.definirPorte();

        return pet;
    }
}