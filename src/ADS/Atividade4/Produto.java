package ADS.Atividade4;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro = precoVenda - precoCusto;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda < this.precoCusto) {
            System.out.printf("O preço de venda não pode ser menor que o preço de custo! Tente novamente.");
            return;
        } else {
            this.precoVenda = precoVenda;
        }
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double calcularMargemLucro() {
        return this.precoVenda - this.precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return calcularMargemLucro() * 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double custo, venda;
        String nome;
        System.out.printf("Digite o nome do produto: ");
        nome = scanner.nextLine();
        System.out.printf("Informe o preço de custo: ");
        custo = scanner.nextDouble();
        System.out.printf("Informe o preço de venda: ");
        venda = scanner.nextDouble();
        Produto p = new Produto(
                nome,
                custo,
                venda
        );
        System.out.printf("\nEssa é a margem de lucro do Produto: " + p.calcularMargemLucro());
        System.out.printf("\nEssa é o percentual de lucro do Produto: " + p.getMargemLucroPorcentagem());
    }
}
