package org.example.Aula16;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {     // getter: devolve
        return titular;
    } public double getSaldo(){
        return saldo;
    }

    public void setTitular(String Titular) {
        if (Titular == null || Titular.isEmpty()) {
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }
        this.titular = Titular;
    }

}