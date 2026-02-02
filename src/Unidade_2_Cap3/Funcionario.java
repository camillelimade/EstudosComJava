package Unidade_2_Cap3;

public class Funcionario {
    private String nome;
    private double salario;
    private int telefone;

    public Funcionario(String nome, double salario, int telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalario() {
        return salario;
    }
}
