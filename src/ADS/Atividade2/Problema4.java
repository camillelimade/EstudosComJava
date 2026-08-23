package ADS.Atividade2;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // variavel de leitura
        int voto, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0; // votos padrao
        int votoNull = 0, votoBranco = 0; // votos alternativos
        boolean rodando = true; // variavel motor do while
        // opções de entrada para o usuário
        System.out.println("Menu de votos: ");
        System.out.println("Digite 5 para Voto Nulo");
        System.out.println("Digite 6 para Voto em Branco");
        System.out.println("Digite 1, 2, 3 e 4 para os demais candidatos");
        System.out.println("Digite 0 para sair do programa");
        // loop que recebe os votos e armazena contadores de cada um, com mensagens de sucesso
        while (rodando){
            System.out.println("-------------------------------");
            System.out.println("Digite seu voto: "); // pede voto
            voto = input.nextInt(); // armazena voto
            switch (voto){ // usa voto pra direcionar mensagens e executar contadores
                case 1:
                    System.out.println("Voto 1 registrado com sucesso!");
                    voto1++;
                    break;
                case 2:
                    System.out.println("Voto 2 registrado com sucesso!");
                    voto2++;
                    break;
                case 3:
                    System.out.println("Voto 3 registrado com sucesso!");
                    voto3++;
                    break;
                case 4:
                    System.out.println("Voto 4 registrado com sucesso!");
                    voto4++;
                    break;
                case 5:
                    System.out.println("Voto nulo registrado para fins de pesquisa");
                    votoNull++;
                    break;
                case 6:
                    System.out.println("Voto em branco registrado para fins de pesquisa");
                    votoBranco++;
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    // caso a entrada de voto seja diferente do esperado, um pouco de tratamento de erros
                    System.out.println("Código inválido: tente novamente");
            }
        }
        // junção de todos os votos pra realizar o calculo de porcentagem
        int geral = voto1 + voto2 + voto3 + voto4 + votoNull + votoBranco;
        System.out.println("Exibindo quantidade de votos por candidato: ");
        // variaveis de porcentagem de cada voto
        float porUm, porDois, porTres, porQuarta;
        // calculo da porcentagem na prática
        porUm = ((float)voto1 / geral) * 100;
        porDois = ((float)voto2 / geral) * 100;
        porTres = ((float)voto3 / geral) * 100;
        porQuarta = ((float)voto4 / geral) * 100;
        // exibe quantidade de votos por candidato e porcentagem entre cada um
        System.out.println("-------------------------------");
        System.out.println("Candidato 1: " + voto1);
        System.out.println("Porcentagem: " + porUm);
        System.out.println("-------------------------------");
        System.out.println("Candidato 2: " + voto2);
        System.out.println("Porcentagem: " + porDois);
        System.out.println("-------------------------------");
        System.out.println("Candidato 3: " + voto3);
        System.out.println("Porcentagem: " + porTres);
        System.out.println("-------------------------------");
        System.out.println("Candidato 4: " + voto4);
        System.out.println("Porcentagem: " + porQuarta);
        System.out.println("-------------------------------");
        float porcentagem1 = 0;
        // tras a porcentagem de votos alternativos (nulo e brancos)
        if (geral > 0){
            porcentagem1 = ((float)(votoNull + votoBranco) / geral) * 100;
        }
        System.out.println("Porcentagem de votos nulos e branco: " + porcentagem1);
    }
}