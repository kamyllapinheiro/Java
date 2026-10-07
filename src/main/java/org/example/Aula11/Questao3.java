package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

public class Questao3 {
    static void main(String[] args) {

        //- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> listaNome2 = new ArrayList<>(List.of("Kamy" , "Leandro" , "Bob" , "Lua"));
        System.out.println(listaNome2);


        listaNome2.set(1, "Ferraz");
        System.out.println(listaNome2);

    }
}
