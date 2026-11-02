package ADS.Atividade8;

public class Quarto extends Acomodacao {
    public Quarto(double valorDiaria) {
        super(valorDiaria);
    }

    @Override
    public double calcularValor(double quantidadeDeDiarias) {
        return quantidadeDeDiarias * getValorDiaria();
    }

}
