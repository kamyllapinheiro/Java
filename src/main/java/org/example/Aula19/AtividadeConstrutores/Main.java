//Refatore seu código da atividade de construtor com o Builder (Pode utilizar lombok).

package org.example.Aula19.AtividadeConstrutores;

public class Main {
    public static void main(String[] args) {

        Agendamento meuAgendamento = Agendamento.builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .observacao("alérgico a shampoo")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .desconto(10.0)
                .build();

        meuAgendamento.mostrar();

        Agendamento Luna = Agendamento.builder()
                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .observacao("")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .desconto(0.0)
                .build();


        Luna.mostrar();


    Agendamento Mel = Agendamento.builder()
            .nomePet("Mel")
            .servico("Banho")
            .horario("16h")
            .observacao("")
            .perfume(false)
            .laco(false)
            .hidratacao(true)
            .desconto(0.0)
            .build();
        Mel.mostrar();

    }
//   - Olhando só a linha do new, dá pra saber o que cada
//     true/false significa? Não, preciso consultar a ordem dos parâmetros.

//   - Se você trocar a ordem do perfume e do laço sem querer,
//     o código compila? Alguém perceberia o erro? Ele vai rodas, mas pode ficar em ordem incorreta o agendamento.


//   - No agendamento b, quantos valores você digitou só pra
//     dizer "não quero isso"? 5 valores
}

