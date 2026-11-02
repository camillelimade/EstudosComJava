package ADS.Atividade8;

public class Caminhao extends Veiculo implements Rastreavel{
    private int quantidadeEixos;
    private float valorCombustivel;
    private double latitude;
    private double longitude;

    public Caminhao(String placa, String modelo, float capacidadeCarga, float quilometragem, int quantidadeEixos, float valorCombustivel, double latitude, double longitude) {
        super(placa, modelo, capacidadeCarga, quilometragem);
        this.quantidadeEixos = quantidadeEixos;
        this.valorCombustivel = valorCombustivel;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
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
        obterLocalizacao();
    }

    @Override
    public void atualizarLocalizacao(double latitude, double longitude) {
        setLatitude(latitude); // atualiza os valores com setter
        setLongitude(longitude);
    }

    @Override
    public String obterLocalizacao() {
        String loc = "(Latitude: " + latitude + ", Longitude: " + longitude + ")";
        return "Última localização: " + loc;
    }
}
