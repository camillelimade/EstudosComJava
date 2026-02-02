package Unidade_2_Cap3;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String nome, double salario, int telefone) {
        super(nome, salario, telefone);
    }
    @Override
    public double calcularSalario(){
        int aumentoLiquido = 1000;
        return getSalario() + aumentoLiquido;
    }
    public static void main(String[] args){
        FuncionarioPJ pessoaJuridica = new FuncionarioPJ(
                "Jorge Ben Jor",
                4500,
                54892215
        );
        pessoaJuridica.calcularSalario();
    }
}
