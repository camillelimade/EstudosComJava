package Abstracao;

public class Gatos implements Animais {
    public String nome;
    public String raca;
    public Gatos(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    //  a anotação override serve para referenciar que uma função ou seja um método está sendo reescrito
    @Override
    public void emitirSom(){
        System.out.println( this.nome + " está miando nesse exato momento! ");
    }
    @Override
    public void seAlimentar(){
        System.out.println(this.nome + " está comendo nesse exato momento! ");
    }

    @Override
    public void descricao() {
        System.out.println("A raça de " + this.nome + " é: " + this.raca);
    }

    public static void main(String[] args){

    }

}
