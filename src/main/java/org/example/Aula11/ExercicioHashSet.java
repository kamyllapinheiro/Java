package org.example.Aula11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExercicioHashSet {
    public static void main(String[] args) {
//
//        1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//        com o repetido.
//        HashSet<String> nomes = new HashSet<>();
//        nomes.add("Kamy");
//        nomes.add("Kamy");
//        nomes.add("Leandro");
//        nomes.add("Le");
//
//        System.out.println(nomes);
//        System.out.println(nomes.size());

        //2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        //   de um if para avisar se a cor "verde" já está no conjunto ou não.
//        HashSet<String> cores = new HashSet<>();
//        ArrayList<String> listaCores = new ArrayList<>();
//
//        listaCores.add("Verde");
//        listaCores.add("Azul");
//        listaCores.add("Rosa");
//        cores.addAll(listaCores);
//
//        if (cores.contains("Verde")) {
//            System.out.println("A cor verde está no conjunto");
//        } else {
//            System.out.println("A cor não está no conjunto");
//        }

//        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//        tirar os repetidos. Imprima os dois e compare.
//        ArrayList<String> listas = new ArrayList<>();
//        listas.addAll(List.of("Kamy", "Kamy", "Leandro"));
//        System.out.println(listas);
//        HashSet<String> lista = new HashSet<>(listas);
//        System.out.println(lista);

//        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//        imprima de novo, junto com o tamanho.

//        HashSet<String> cpfs = new HashSet<>();
//        cpfs.add("12345625688");
//        cpfs.add("11124624976");
//        cpfs.add("56428946935");
//        System.out.println(cpfs);
//
//        cpfs.remove("12345625688");
//        System.out.println(cpfs);
//
//        System.out.println(cpfs.size());

//        5. Crie um HashSet com três frutas e percorra ele com for,
//        imprimindo uma por linha.

//        HashSet<String> frutas = new HashSet<>();
//
//        frutas.add("Maça");
//        frutas.add("Banana");
//        frutas.add("Melancia");
//
//        for (fruta : frutas){
//            System.out.println(frutas(fruta);
//        }

//        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//        imprima o isEmpty() de novo.

        HashSet<String> vazio= new HashSet<>();
        System.out.println(vazio.isEmpty());

        vazio.add("Informação");
        System.out.println(vazio.isEmpty());













    }
}
