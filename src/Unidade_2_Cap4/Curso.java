package Unidade_2_Cap4;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno "+ aluno.getNome() +" adicionado com sucesso");
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void divisor(){
        System.out.println("---------------------------------------------");
    }
    public void listarAlunos(){
        if (alunos.isEmpty()){
            divisor();
            System.out.println("O curso " + nome + " não retornou nenhum aluno!");
            divisor();
        }
        // parte que quero para reutilizar em removeAluno();
        divisor();
        System.out.println("Aqui estão os alunos do Curso " + nome + ":");
        divisor();
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println( (1 + i) + ". " + alunos.get(i).getNome());
        }
        divisor();
    }

    public void removeAluno(){
        System.out.println("Digite o Aluno que deseja remover: ");
        Scanner leitor = new  Scanner(System.in);
        String nomeExcluir = leitor.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nomeExcluir)) {
                System.out.println("Aluno " + alunos.get(i).getNome() + " removido com sucesso");
                alunos.remove(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println(nomeExcluir + " não encontrado!");
        }
    }

}
