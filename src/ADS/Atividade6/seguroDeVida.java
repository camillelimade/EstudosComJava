package ADS.Atividade6;

public class seguroDeVida extends Conta implements Tributavel{
   private double saldo;
    @Override
    public double calculaTributos() {
        return saldo + 35;
    }
    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    void deposita(double valor) {
        this.saldo += valor;
    }
    public seguroDeVida(double saldo) {
        this.saldo = saldo;
    }
}
