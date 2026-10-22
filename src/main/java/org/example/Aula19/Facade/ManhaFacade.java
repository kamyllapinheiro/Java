package org.example.Aula19.Facade;

public class ManhaFacade {
    Cafeteira cafeteira;
    Chuveiro chuveiro;
    Despertador despertar;


    public ManhaFacade(){
        cafeteira = new Cafeteira();
        chuveiro = new Chuveiro();
        despertar = new Despertador();
    }

    public void acordar(){
        despertar.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }

}