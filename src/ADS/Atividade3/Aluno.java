package ADS.Atividade3;

import java.util.Scanner;

public class Aluno {
    private String matricula;
    private String nome;
    private float notaUmEtapaUm;
    private float notaDoisEtapaUm;

    private float notaUmEtapaDois;
    private float notaDoisEtapaDois;

    private float mediaEtapa1;
    private float mediaEtapa2;
    private float mediaFinal;
    private String resultFinal;

    public Aluno(String matricula, String nome, float notaUmEtapaUm, float notaDoisEtapaUm, float notaUmEtapaDois, float notaDoisEtapaDois) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaUmEtapaUm = notaUmEtapaUm;
        this.notaDoisEtapaUm = notaDoisEtapaUm;
        this.notaUmEtapaDois = notaUmEtapaDois;
        this.notaDoisEtapaDois = notaDoisEtapaDois;
        this.mediaEtapa1 = mediaEtapa1;
        this.mediaEtapa2 = mediaEtapa2;
        this.mediaFinal = mediaFinal;
        this.resultFinal = resultFinal;
    }

    public String getNome() {
        return nome;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void calculaMediaFinal() {
        mediaFinal = (mediaEtapa1 + mediaEtapa2) / 2;
    }

    public float calcularMediaPorEtapa(int codEtapa, float peso1, float peso2) {
        float media;
        if (codEtapa == 1) {
            media = (notaUmEtapaUm * peso1 + notaDoisEtapaUm * peso2) / (peso1 + peso2);
            mediaEtapa1 = media;
        } else if (codEtapa == 2) {
            media = (notaUmEtapaDois * peso1 + notaDoisEtapaDois * peso2) / (peso1 + peso2);
            mediaEtapa2 = media;
        } else {
            System.out.println("Entrada inválida, tente novamente");
            return 0;
        }
        return media;
    }

    public void calculaResultadoFinal() {
        if (mediaFinal >= 7) {
            resultFinal = "Aprovado";
        } else if (mediaFinal >= 3) {
            resultFinal = "Avaliação Final";
        } else {
            resultFinal = "Reprovado";
        }
    }

    public String apresentaResultado() {
        return "\nMatrícula: " + matricula +
                "\nNome: " + nome +
                "\nNota 1, Etapa 1: " + notaUmEtapaUm +
                "\nNova 2, Etapa 1: " + notaDoisEtapaUm +
                "\nMédia Etapa 1: " + mediaEtapa1 +
                "\nNota 1, Etapa 2: " + notaUmEtapaDois +
                "\nNota 2, Etapa 2: " + notaDoisEtapaDois +
                "\nMédia Etapa 2: " + mediaEtapa2 +
                "\nMédia Final: " + mediaFinal +
                "\nResultado Final: " + resultFinal;
    }

    private static Aluno cadastrarAluno(Scanner leitor) {
        System.out.println("Digite os dados do aluno: ");
        System.out.println("Matrícula: ");
        String matricula = leitor.nextLine();

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Nota 1 da Etapa 1: ");
        float nota1etapa1 = leitor.nextFloat();

        System.out.println("Nota 2 da Etapa 1: ");
        float nota2etapa1 = leitor.nextFloat();

        System.out.println("Nota 1 da Etapa 2: ");
        float nota1etapa2 = leitor.nextFloat();

        System.out.println("Nota 2 da Etapa 2: ");
        float nota2etapa2 = leitor.nextFloat();

        return new Aluno(matricula, nome, nota1etapa1, nota2etapa1, nota1etapa2, nota2etapa2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = cadastrarAluno(entrada);
        System.out.println("Digite o peso da avaliação 1 da Etapa 1");
        float p1 = entrada.nextFloat();
        System.out.println("Digite o peso da avaliação 2 da Etapa 1");
        float p2 = entrada.nextFloat();
        System.out.println("Digite o peso da avaliação 1 da Etapa 2");
        float p3 = entrada.nextFloat();
        System.out.println("Digite o peso da avaliação 2 da Etapa 2");
        float p4 = entrada.nextFloat();
        aluno.calcularMediaPorEtapa(1, p1, p2);
        aluno.calcularMediaPorEtapa(2, p3, p4);
        aluno.calculaMediaFinal();
        aluno.calculaResultadoFinal();
        System.out.println(aluno.apresentaResultado());
    }
}
