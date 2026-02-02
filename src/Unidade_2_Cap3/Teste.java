package Unidade_2_Cap3;

import java.util.ArrayList;
import java.util.List;

public class Teste extends Funcionario {
    public Teste(String nome, double salario, int telefone) {
        super(nome, salario, telefone);
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioCLT("Ana", 3000, 500));
        funcionarios.add(new FuncionarioPJ("Carlos", 160, 40));
        funcionarios.add(new FuncionarioPJ("Maria", 120, 40));
        funcionarios.add(new FuncionarioPJ("Pedro", 120, 40));
        funcionarios.add(new FuncionarioCLT("Luiza", 5000, 120));

        for (Funcionario f : funcionarios) {
            System.out.println(
                    "Funcionário: " + f.getNome() +
                    ", Salário: R$ " + f.calcularSalario()
            );
        }

    }
}
