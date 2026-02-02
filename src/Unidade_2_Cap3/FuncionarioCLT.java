package Unidade_2_Cap3;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, double salario, int telefone) {
        super(nome, salario, telefone);
    }

    @Override
    public double calcularSalario(){
        double valeTransporte = 150.0;
        return getSalario() + valeTransporte;
    }
    public static void main(String[] args){
        FuncionarioCLT trabalhadorCLT =  new FuncionarioCLT("Rita Lee", 1500.0, 80028922);
        trabalhadorCLT.calcularSalario();
    }
}
