package org.example.Aula11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AulaHashMap {
    static void main(String[] args) {

        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Ane", "ane@hmail.com");

        System.out.println(emails.get("Ane"));

        System.out.println(emails.getOrDefault("Ane","Posição inválida"));

        System.out.println(emails.containsKey("Ane"));


        HashMap<String, String> emails = new HashMap<>();
        ArrayList<String> lista = new ArrayList<>();
        HashMap<String, ArrayList> email = new HashMap<>();
        email.put("Flora", lista);
        lista.add("Senha");
        lista.addAll(List.of("CPF", "RG", "CNH"));
        System.out.println(email);

        System.out.println(email.containsKey("Maria"));


    }
}
