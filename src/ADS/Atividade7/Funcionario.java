package ADS.Atividade7;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    double aumentoSalarial(double valor){
        return salario + valor;
    }
    double ganhoAnual(){
        return salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void exibeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}
