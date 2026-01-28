package Examples;

public class Conta {
    private double saldo;
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else{
            System.out.println("Erro: O saldo não pode ser negativo!");
        }
    }
}
