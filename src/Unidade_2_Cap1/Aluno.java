package Unidade_2_Cap1;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota > 0 && nota < 10) {
            this.nota = nota;
        }else {
            System.out.println("Digite um valor válido para a nota: ");
        }
    }

    public static void main(String[] args) {

    }
}
