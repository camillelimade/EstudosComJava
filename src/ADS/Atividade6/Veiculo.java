package ADS.Atividade6;

public class Veiculo {
    String placa;
    int ano;
    public Veiculo(){

    }
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirDados(){
        System.out.println("Exibindo dados do veículo...");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
    }
}
