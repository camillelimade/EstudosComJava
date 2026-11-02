package ADS.Atividade8;

public class VeiculoEletrico extends Veiculo implements Rastreavel{
    private double capacidadeBateria;
    private double consumoMedio;
    private double custoKwh;
    private double latitude;
    private double longitude;

    public VeiculoEletrico(String placa, String modelo, float capacidadeCarga, float quilometragem, double capacidadeBateria, double consumoMedio, double custoKwh, double latitude, double longitude) {
        super(placa, modelo, capacidadeCarga, quilometragem);
        this.capacidadeBateria = capacidadeBateria;
        this.consumoMedio = consumoMedio;
        this.custoKwh = custoKwh;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void exibirDados() {
        System.out.println("-----------------------");
        System.out.println("Veículo: Veiculo Elétrico");
        System.out.println("-----------------------");
        super.exibirDados();
        System.out.println("Capacidade da Bateria: " + capacidadeBateria);
        System.out.println("Consumo médio: " + consumoMedio);
        System.out.println("Custo em Kw/h: " + custoKwh);
        obterLocalizacao();
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getCustoKwh() {
        return custoKwh;
    }

    public void setCustoKwh(double custoKwh) {
        this.custoKwh = custoKwh;
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

    @Override
    public void calcularCustoViagem() {
        System.out.println("Custo da Viagem do Veículo: " + getQuilometragem() * consumoMedio * custoKwh);
    }
}
