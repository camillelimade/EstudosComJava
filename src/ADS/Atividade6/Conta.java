package ADS.Atividade6;

public abstract class Conta {
    private double saldo;
    private double deposita(double valor){
       return this.saldo += valor;
    }
    public double saca(double valor){
        return this.saldo -= valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
