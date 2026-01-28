package Unidade_2;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    public  void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0){
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public Produtos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public static void main(String[] args) {
    Produtos produto1 = new Produtos ("Pc gamer", 100.0, 8);
    produto1.setPreco(1300);
    produto1.setQuantidadeEstoque(5);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço:  " + produto1.getPreco());
        System.out.println("Quantidade em nosso estoque: " + produto1.getQuantidadeEstoque());
    }
}
