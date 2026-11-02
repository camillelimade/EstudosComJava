package ADS.Atividade8;

public class Motocicleta extends Veiculo{
    private int cilindradas;
    private float valorCombustivel;

    public Motocicleta(String placa, String modelo, float capacidadeCarga, float quilometragem, int cilindradas, float valorCombustivel) {
        super(placa, modelo, capacidadeCarga, quilometragem);
        this.cilindradas = cilindradas;
        this.valorCombustivel = valorCombustivel;
    }

    @Override
    public void calcularCustoViagem() {
        float combustivel = (getQuilometragem() / 25.0f) * this.valorCombustivel;
        float manutencao = getQuilometragem() * 0.15f;
        System.out.println("Custo de Viagem do Veículo: " + combustivel+ manutencao);
    }

    @Override
    public void exibirDados() {
        System.out.println("-----------------------");
        System.out.println("Veículo: Motocicleta");
        System.out.println("-----------------------");
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Valor do combustivel: " + valorCombustivel);
        super.exibirDados();
    }
}
