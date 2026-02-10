package Unidade_2_Cap3;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor);
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$" + valor);
    }
    public static void main(String[] args) {
        PagamentoCartao novoCartao = new PagamentoCartao(70.5);
        novoCartao.processarPagamento(novoCartao.getValor());
    }
}
