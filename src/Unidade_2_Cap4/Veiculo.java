package Unidade_2_Cap4;

public abstract class Veiculo {
    private String modelo;
    private int ano;

    public abstract void mover();

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}
