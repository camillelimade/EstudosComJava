package Unidade_2_Cap3;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String raca, String cor) {
        super(nome, idade, raca);
        this.cor = cor;
    }
    @Override
    public void fazerSom(){
        System.out.println(this.getNome() + " está miando!");
    }
    public static void main(String[] args){
        Gato meuGato = new Gato(
                "Fofo",
                5,
                "Viralata",
                "Cinza rajado"
        );
        meuGato.fazerSom();

    }
}
