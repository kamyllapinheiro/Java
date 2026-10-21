package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
    static void main(String[] args) {

        //- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
        ArrayList<String> nomesSeis = new ArrayList<>();
        nomesSeis.addAll(List.of("Lua", "Bob" , "Lara", "Amanda", "liz" , "Dora"));

        for (int i =0;i <nomesSeis.size(); i++){
            System.out.println(i + ":" + nomesSeis.get(i));

        }
    }
}
