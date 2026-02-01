package Unidade_2_Cap1;

import java.util.Scanner;

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

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public Produtos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Pc gamer", 100.0, 8);
        produto1.setPreco(1300);
        produto1.setQuantidadeEstoque(5);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço:  " + produto1.getPreco());
        System.out.println("Quantidade em nosso estoque: " + produto1.getQuantidadeEstoque());


        while (true) {
            System.out.println("Deseja atualizar dados de " + produto1.getNome() + "?  1 Para Sim // 0 Para Não");
            Scanner entr = new Scanner(System.in);
            int opcao = entr.nextInt();
            entr.nextLine();
            switch (opcao) {
                case 1:
                    produto1.setNome("PC Gamer de última geração com vídeo integrado"); // edita nome
                    System.out.println("Esse é o novo nome: " + produto1.getNome()); // exibe nome

                    produto1.setPreco(1350); // edita preço
                    System.out.println("Esse é o novo preço: " + produto1.getPreco()); // exibe preço

                    produto1.setQuantidadeEstoque(2); // edita quant
                    System.out.println("Atualmente esse é o estoque total: " + produto1.getQuantidadeEstoque());
                    System.out.println("            ");
                    System.out.println("            ");
                    break;
                case 0:
                    System.out.println("Ok, nos vemos na próxima! :)");
                    System.out.println("            ");
                    System.out.println("            ");
                    break;
                default:
                    if (opcao != 1 || opcao != 0) {
                        System.out.println("Digite um valor válido dentro dos parametros oferecidos");
                    } else {
                        System.out.println("Infelizmente ocorreu um erro, tente novamente! :(");
                        System.out.println("            ");
                        System.out.println("            ");
                    }

            }

        }


    }
}
