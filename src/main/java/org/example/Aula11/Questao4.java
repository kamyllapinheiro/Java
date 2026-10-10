package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

public class Questao4 {
    static void main(String[] args) {

        // Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> nomeCidade = new ArrayList<>();
        nomeCidade.addAll(List.of("Teresópolis","Niterói", "Cabo frio", "Nova Friburgo"));

        nomeCidade.remove(1);
        System.out.println(nomeCidade);
        System.out.println(nomeCidade.size());
    }
}
