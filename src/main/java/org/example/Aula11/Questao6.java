package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao6 {
    static void main(String[] argsg) {
        //Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomeCinco = new ArrayList<>();
        nomeCinco.addAll(List.of("Kamy", "Lia", "Maria", "Carla", "Zoe"));
        String nome1 = sc.nextLine();

        if (nomeCinco.contains(nome1)){
            System.out.println(nome1 + " está na posição: " + nomeCinco.indexOf(nome1));
        }else {
            System.out.println("O nome não existe na lista!");
        }


    }
}
