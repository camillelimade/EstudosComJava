package ADS.Atividade6;

public class Caminhao extends Veiculo{
    int eixos;
    public Caminhao(){

    }

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de eixos: " + getEixos());
    }
}
