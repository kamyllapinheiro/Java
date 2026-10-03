/*4 - Crie uma classe chamada Pet.

Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.

 */


package org.example.aulaScanner5;

public class questão4 {
    public static void main(String [] args) {
        Pet pet = new Pet();

        pet.tipo = "cachorro";
        pet.nome = "Lua";
        pet.raca = "Vira lata";
        pet.peso = 10;
        System.out.println(" O nome do meu " + pet.tipo +  " é " + pet.nome + ". A raça dela é " + pet.raca + ", e ele pesa " + pet.peso + " kilos. ");

        pet.tipo = "Gato";
        pet.nome = "Bob";
        pet.raca = "Vira lata";
        pet.peso = 5;
        System.out.println(" O nome do meu " + pet.tipo + " é " + pet.nome + ". A raça dele é " + pet.raca + ", e ele pesa " + pet.peso + " kilos. ");

    }
}
