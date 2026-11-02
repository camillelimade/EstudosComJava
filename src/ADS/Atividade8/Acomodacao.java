package ADS.Atividade8;

public abstract class Acomodacao {
    private int numero;
    private String descricao;
    private double valorDiaria;
    private double capacidade;

    public Acomodacao(double valorDiaria, double quantidadeDeDiarias) {
    }

    public Acomodacao(double valorDiaria) {
    }

    public void exibirInformacoes(){
        System.out.println("Numero: " + numero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor diaria: " + valorDiaria);
        System.out.println("Capacidade: " + capacidade);
    }
    public double calcularValor(double quantidadeDeDiarias){return 0.0;}

    public Acomodacao(int numero, String descricao, double valorDiaria, double capacidade) {
        this.numero = numero;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
}
