package org.example.Aula19.AtividadeFactory;

public class Main {
    static void main() {


    AnimalFactory fabrica = new AnimalFactory();

    Animal meuCachorro = fabrica.getAnimal("Cachorro");
    meuCachorro.emitirSom();

    Animal meuGato = fabrica.getAnimal("Gato");
    meuGato.emitirSom();

    }
}
