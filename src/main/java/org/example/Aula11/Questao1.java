package org.example.Aula11;



import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    static void main(String[] args) {

        // Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.addAll(List.of("Kamy, Ana, Leandro"));
        System.out.println(listaNome);
    }
}
