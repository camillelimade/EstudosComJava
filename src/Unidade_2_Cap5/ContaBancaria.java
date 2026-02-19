package Unidade_2_Cap5;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double sacar(double valor) throws SaldoInsuficiente {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new SaldoInsuficiente("Saldo insuficiente | Seu saldo atual: " + this.saldo);
        }
        return saldo;
    }
    // public void depositar(double valor) throws SaldoInsuficiente {}
    public static void main(String[] args){
        ContaBancaria novaConta = new ContaBancaria(123.0);
        novaConta.sacar(456.8);

    }
}
