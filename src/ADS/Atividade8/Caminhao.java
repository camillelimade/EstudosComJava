package ADS.Atividade8;

public class Caminhao extends Veiculo{
    private int quantidadeEixos;
    private float valorCombustivel;

    public Caminhao(String placa, String modelo, float capacidadeCarga, float quilometragem, int quantidadeEixos, float valorCombustivel) {
        super(placa, modelo, capacidadeCarga, quilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.valorCombustivel = valorCombustivel;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    public float getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(float valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    @Override
    public void calcularCustoViagem() {
        float combustivel = (getQuilometragem() / 3.0f) * this.valorCombustivel;
        float manutencao = getQuilometragem() * 0.80f;
        float pedagio = getQuilometragem() * 0.20f * this.quantidadeEixos;
        System.out.println("Custo de Viagem do veiculo: " + combustivel + manutencao + pedagio);
    }

    @Override
    public void exibirDados() {
        System.out.println("-----------------------");
        System.out.println("Veículo: Caminhão");
        System.out.println("-----------------------");
        super.exibirDados();
        System.out.println("Quantidade de Eixos: " + this.quantidadeEixos);
        System.out.println("Valor do Combustivel: " + this.valorCombustivel);
    }
}
