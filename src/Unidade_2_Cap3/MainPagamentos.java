package Unidade_2_Cap3;

import java.util.ArrayList;

public class MainPagamentos {
    public static void main(String[] args) {
        ArrayList<Pagamento> PagamentosVariados = new ArrayList<Pagamento>();
        PagamentosVariados.add(new PagamentoPix(70.5));
        PagamentosVariados.add(new PagamentoCartao(10.0));
        PagamentosVariados.add(new PagamentoPix(12.5));
        PagamentosVariados.add(new PagamentoCartao(34.9));
        PagamentosVariados.add(new PagamentoPix(89.9));
        for (Pagamento pagamento : PagamentosVariados){
            pagamento.processarPagamento(pagamento.getValor());
        }
    }
}
