package org.example.Aula17.Questao6;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("SMS:" + mensagem);

    }
}
