package Unidade_2_Cap3;

public class Cachorro extends Animal {
    private String cor;

    public Cachorro(String nome, int idade, String raca, String cor) {
        super(nome, idade, raca);
        this.cor = cor;
    }

    @Override
    public void fazerSom() {

        System.out.println(getNome() + " está latindo!");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args){
        Cachorro cadelinha = new Cachorro(
                "Sandy",
                8,
                "Pincher",
                "Preta"
        );
        cadelinha.fazerSom();
    }
}
