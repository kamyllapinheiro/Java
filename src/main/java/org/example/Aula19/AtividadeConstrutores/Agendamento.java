package org.example.Aula19.AtividadeConstrutores;

import lombok.Builder;

@Builder
public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;


    public void mostrar(){
        System.out.println("Nome: " + nomePet);
        System.out.println("Servico: " + servico);
        System.out.println("Horario: " + horario);
        System.out.println("Observacao: " + observacao);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laco: " + laco);
        System.out.println("Hidratacao: " + hidratacao);
        System.out.println("Desconto: " + desconto);

    }

}
