package ADS.Atividade6;

public class contaCorrente extends Conta implements Tributavel{
    private double saldo;

    public contaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.03;
    }
}
