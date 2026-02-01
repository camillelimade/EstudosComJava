package Unidade_2_Cap1;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String setor;

    public Funcionario(String nomeCompleto, int idade, String cargo, String setor, double salario) {
        super(nomeCompleto, idade); // chama o construtor da classe mãe Pessoa
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static void main (String[] args) {
        Funcionario f = new Funcionario(
                "Camille Lima de Morais",
                18,
                "DEV Java",
                "TI",
                2500.00
                );

    }
}
