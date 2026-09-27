package ADS.Atividade6;

public class contaPoupanca extends Conta implements Tributavel {
    private double saldo;

    public contaPoupanca(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    void deposita(double valor) {
        this.saldo += valor;
    }
    @Override
    public double calculaTributos() {
        return 0;
    }
}
