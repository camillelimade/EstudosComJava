package ADS.Atividade8;

public class Suite extends Acomodacao implements Descontavel {
    private double valorServico;

    public Suite(int numero, String descricao, double valorDiaria, double capacidade, double valorServico) {
        super(numero, descricao, valorDiaria, capacidade);
        this.valorServico = valorServico;
    }

    @Override
    public double calcularValor(double quantidadeDeDiarias) {
        return (quantidadeDeDiarias * getValorDiaria()) + valorServico;
    }

    @Override
    public double calcularDesconto(double diarias) {
        if (diarias >= 7){
            return calcularValor(diarias) - (calcularValor(diarias) * 0.10);
        }else{
            return 0.0;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Valor do serviço: " + valorServico);
        super.exibirInformacoes();
    }
}
