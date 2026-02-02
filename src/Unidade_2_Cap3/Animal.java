package Unidade_2_Cap3;

public class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    public void fazerSom(){
        System.out.println(this.nome + " está fazendo som");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raca;
    }

    public void setRaça(String raça) {
        this.raca = raca;
    }
    public static void main(String[] args){

    }
}
