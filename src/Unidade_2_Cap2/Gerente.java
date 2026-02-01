package Unidade_2_Cap2;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nomeCompleto, int idade, String setor, double salario, String departamento) {
        super(nomeCompleto, idade, setor, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static void main(String[] args) {

    }
}
