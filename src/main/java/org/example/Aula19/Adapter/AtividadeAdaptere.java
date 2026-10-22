package org.example.Aula19.Adapter;

public class AtividadeAdaptere {
    static void main(String[] args) {

        //Pagamento pagamento new Process();

        PayPalAPI apiOriginal = new PayPalAPI();
        Pagamento pagamento = new PayPalAdapter(apiOriginal);

        pagamento.pagar();

    }
}
