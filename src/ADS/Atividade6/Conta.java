package ADS.Atividade6;

public abstract class Conta {
    private double saldo;

    void deposita(double valor) {
        double saldoAtualizado = saldo += valor;
        setSaldo(saldoAtualizado);
    }

    public double getSaldo() {
        return saldo;
    }

    double saca(double valor) {
        try {
            if (valor <= this.saldo) {
                return this.saldo -= valor;
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro: o valor é maior que o saldo, tente novamente. " + e);
        }
        return 0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
