package Unidade_2_Cap3;

public class PagamentoPix extends Pagamento{
    public PagamentoPix(double valor) {
        super(valor);
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$" + valor);
    }
    public static void main (String[] args) {
        PagamentoPix payPix1 =  new PagamentoPix(11.0);
        payPix1.processarPagamento(payPix1.getValor());
    }
}
