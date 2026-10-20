package ADS.Atividade7;

public class Assistente extends Funcionario {
    int numMatricula;

    public Assistente(String nome, double salario, int numMatricula) {
        super(nome, numMatricula);
        this.numMatricula = numMatricula;
    }
    @Override
    void exibeDados(){
        super.exibeDados();
        System.out.println("Matricula: " + this.numMatricula);
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
}