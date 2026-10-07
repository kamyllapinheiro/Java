package org.example.Aula12;

import java.util.ArrayDeque;

import java.util.List;

public class AulaQueue {
    static void main(String[] args) {

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Kamy");
        fila.add("Ana");
        fila.addAll(List.of("Kamy", "Kamylla", "Leandro", "Lua", "Bob"));
        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.poll());

        System.out.println(fila);

        fila.poll();
        System.out.println(fila);


        if (fila.isEmpty() == true) {
            System.out.println("Adicione valores na fila.");

        } else {

        }
    }
}
