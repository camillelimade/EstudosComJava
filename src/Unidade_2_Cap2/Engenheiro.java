package Unidade_2_Cap2;

public class Engenheiro extends Funcionario{
    private final String cargo;

    public Engenheiro(String nomeCompleto, int idade,String setor, double salario, String cargo) {
        super(nomeCompleto, idade, setor, salario); // chama o construtor da classe mãe Pessoa
        this.cargo = cargo;
    }
    public static void main(String[] args) {
    Engenheiro Camille = new Engenheiro(
            "Camille Limao",
            18,
            "TI",
            1500,
            "Engenheira da Computação"

    );

    }
}
