package Unidade_2_Cap4;

public class MainAlunoCurso {
    public static void main(String[] args) {
        Aluno camille = new  Aluno("Camille Lima");
        Aluno maria = new  Aluno("Maria de Fátima");
        Aluno juan = new  Aluno("Juan Siqueira");
        Aluno daniel = new  Aluno("Daniel Chaves");
        Aluno sara = new  Aluno("Sara Mendes");

        Curso cursoADS = new Curso("ADS");
        cursoADS.addAluno(camille);
        cursoADS.addAluno(maria);
        cursoADS.addAluno(juan);
        cursoADS.addAluno(daniel);
        cursoADS.addAluno(sara);

        cursoADS.listarAlunos();

        // testando com outro curso
        Aluno joao = new Aluno("João Sales");
        Aluno patricia = new Aluno("Patricia Souza");
        Aluno cecilia = new Aluno("Cecilia Oliveira");
        Curso cursoMat = new Curso("Matemática");
        cursoMat.addAluno(joao);
        cursoMat.addAluno(patricia);
        cursoMat.addAluno(cecilia);

        cursoMat.listarAlunos();

        // removendo
        cursoMat.removeAluno();

    }
}
