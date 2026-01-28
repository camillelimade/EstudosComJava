package Unidade_2;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public int setNumero (int numero){
        return this.numero;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;

    }
    public double depositar(){
        this.saldo += this.saldo;
        return  this.saldo;
    }
    public double sacar(){
        this.saldo -= this.saldo;
        return this.saldo;
    }
    public static void main(String[] args) {

    }
}
