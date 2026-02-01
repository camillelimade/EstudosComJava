package Unidade_2_Cap2;

public class Pessoa {
    private String nomeCompleto;
    private int idade;

    public Pessoa(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public static void main(String[] args) {

    }
}
