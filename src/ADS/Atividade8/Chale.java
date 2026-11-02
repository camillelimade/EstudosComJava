package ADS.Atividade8;

public class Chale extends Acomodacao{
    private double taxaLimpeza;
    private boolean possuiCozinha;

    public Chale(int numero, String descricao, double valorDiaria, double capacidade, double taxaLimpeza, boolean possuiCozinha) {
        super(numero, descricao, valorDiaria, capacidade);
        this.taxaLimpeza = taxaLimpeza;
        this.possuiCozinha = possuiCozinha;
    }

    @Override
    public double calcularValor(double quantidadeDeDiarias) {
        if (possuiCozinha){
            return (getValorDiaria() * quantidadeDeDiarias) + taxaLimpeza + (quantidadeDeDiarias * 50);
        }else {
            return (getValorDiaria() * quantidadeDeDiarias) + taxaLimpeza;
        }

    }
}
