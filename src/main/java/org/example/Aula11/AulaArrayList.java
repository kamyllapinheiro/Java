

package org.example.Aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    static void main(String[] args) {

        /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());
        */

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(10);
        lista.add(100);
        System.out.println(lista);

        lista.addAll(List.of(1,5,6,4,10,20,50));
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.get(2));

        //substitui
        lista.set(0,98);
        System.out.println(lista);
        //quantos tem
        System.out.println(lista.size());

        //verifica se contem
        System.out.println(lista.contains(98));


        System.out.println(lista.indexOf(98));

        System.out.println(lista.isEmpty());


    }
}
