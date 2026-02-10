package Unidade_2_Cap3;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico de R$" + valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        Pagamento pay1 = new Pagamento(300.0);
        pay1.processarPagamento(pay1.getValor());
    }
}
