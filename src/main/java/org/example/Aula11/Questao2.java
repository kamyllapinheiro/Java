package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

public class Questao2 {
    static void main(String[] args) {

        //- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList<String> listaFruta = new ArrayList<>(List.of("Manga" , "uva" ,  "banana" , "melancia"));
        System.out.println(listaFruta.get(0));
        System.out.println(listaFruta.get(3));
        System.out.println(listaFruta.size());
    }
}
