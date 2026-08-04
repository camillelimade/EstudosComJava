package ADS;

import java.util.Scanner;

public class AulaDois {
    int idade;
    String nome;
    float altura;
    float peso;

    public AulaDois(int idade, String nome, float altura, float peso) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Aluno" + '\'' +
                " Idade: " + idade + '\'' +
                " Nome: '" + nome + '\'' +
                " Altura: " + altura + '\'' +
                " Peso: "+ peso;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade:  ");
        int idadeUser = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite seu nome:  ");
        String nomeUser = leitor.nextLine();""


        System.out.println("Digite sua altura:  ");
        float alturaUser = leitor.nextFloat();

        System.out.println("Digite seu peso:  ");
        float pesoUser = leitor.nextFloat();
        AulaDois camille = new AulaDois(idadeUser, nomeUser, alturaUser, pesoUser);
    }
}
