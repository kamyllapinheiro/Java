package org.example.aula7;

public class aulaStrings {
    public static void main(String[] args) {

        String nome = "Ana Beatriz";

        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("Beatriz"));
        System.out.println(nome.charAt(4));
        System.out.println(nome.substring(4, 9));
        System.out.println(nome.replace("Beatriz", "Gabriela"));
        System.out.println("     oi     ".trim());
        System.out.println(nome.equals("ana beatriz"));
        System.out.println(nome.equalsIgnoreCase("ana beatriz"));



    }
}
