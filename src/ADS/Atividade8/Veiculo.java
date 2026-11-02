package ADS.Atividade8;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private float capacidadeCarga;
    private float quilometragem;

    public Veiculo(String placa, String modelo, float capacidadeCarga, float quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void exibirDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de Carga: "+ capacidadeCarga);
        System.out.println("Quilometragem: " + quilometragem);
    }
    public void calcularCustoViagem(){}
}
