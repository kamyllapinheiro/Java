package org.example.Aula19.Adapter;

public class PayPalAdapter implements Pagamento{

    private PayPalAPI paypalAPI;
    //construtor que recebe a API de fora
    public  PayPalAdapter(PayPalAPI paypalAPI){
        this.paypalAPI = paypalAPI;
    }

    @Override
    public void pagar() {
        paypalAPI.sendPayment();
    }
}
