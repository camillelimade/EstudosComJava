package Atividades;
import java.util.Scanner;
public class Unidade_1_Camille {
    public static void main (String[] args){
        // 1. Escreva um programa Java que use os operadores lógicos para verificar se um
        //número está entre 10 e 20 (inclusive). Use int numero = 15;.
        int numero = 15;
        if (numero >= 10 && numero <= 20){
            System.out.println("O número " + numero + ", está entre 10 e 20.");
        }else{
            System.out.println("O número " + numero + " não está entre 10 e 20");
        }

        System.out.println("--------------------------");

        // 2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
        //com seus valores atribuídos.
        // Resolvi reunir alguns dados do IBGE, peguei direto do site, então inseri a cada tipo
        // Link do Site: https://www.ibge.gov.br/cidades-e-estados/ce/fortaleza.html
            byte diaFundacao = 13; // Fortaleza foi fundada no dia 13 de Abril de 1726
            int anoFundacao = 1726; // Fortaleza foi fundada no ano de 1726
            short quantBairros = 184; // Fortaleza tem no total 19 municipios
            long bipPercapita = 3579674; // PIB Percapita em Fortal
            float mortalidadeInfantil = 11.78F; // Indice de Mortalidade infantil por mil nascidos vivos
            double densidadeDemo = 7.77552; // Densidade demográfica de fortaleza
            boolean cidadeLitoranea = true;
            char pontoCardeal = 'L'; // Pesquisei sobre e fortal partindo do centro de mapas padrões fica a leste, assim como a maioria das cidades litorais
        System.out.println("Reuni algumas informações acerca de Fortaleza - Ceará :)");
        System.out.println("Fortaleza foi fundada no dia " + diaFundacao + " de Abril");
        System.out.println("Fortaleza tem como ano de Fundação: " +  anoFundacao + " completando atualmente 400 anos");
        System.out.println("Fortaleza segundo o IBGE possui "+ quantBairros + " Bairros atualmente");
        System.out.println("O PIB Percapita em Fortaleza é de " +  bipPercapita);
        System.out.println("O Indice de Mortalidade infantil por mil nascidos vivos é: " + mortalidadeInfantil);
        System.out.println("A densidade demográfica de fortaleza é: " + densidadeDemo);
        System.out.println("É verdade que Fortaleza é uma cidade litoranea? --> " +  cidadeLitoranea);
        System.out.println("Partindo do centro de mapas convencionais fortaleza pode ser localizada seguindo o ponto cardeal Leste(" + pontoCardeal + ")");

        //3. Implemente um programa que exiba um menu com 3 opções:
        //1 - Somar dois números
        //2 - Subtrair dois números
        //3 - Sair
        //O programa deve usar switch para executar a operação escolhida.
        Scanner entrada  = new Scanner(System.in);
        boolean calc = true;

        while(calc){
            System.out.println("   ");
            System.out.println("Seja bem vindo(a) a calculadora estática!");
            System.out.println("Esses são nossos serviços: ");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Sair");

            System.out.println("Digite seu nome: ");
            String user = entrada.nextLine();

            System.out.println("Digite a opção que deseja: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Seja bem vindo(a) " + user + ", essa é a opção de soma! :)");
                    System.out.println("Digite o primeiro número: ");
                    int num1soma = entrada.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int num2soma = entrada.nextInt();
                    entrada.nextLine();

                    if (num1soma != 0 && num2soma != 0){
                        float soma = num1soma + num2soma;
                        System.out.println("Olá " + user + ", O resultado de sua soma é: " + soma);
                    }
                    break;

                case 2:
                    System.out.println("Bem vindo " + user + " a opção de subtração! :)");
                    System.out.println("Digite o primeiro número: ");
                    int num1 = entrada.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int num2 = entrada.nextInt();
                    entrada.nextLine();

                    if (num1 != 0 && num2 != 0){
                        float subtracao = num1 - num2;
                        System.out.println("Olá " + user + ", O resultado de sua subtração é: " + subtracao);
                    }
                    break;

                case 3:
                    System.out.println("Você encerrou o programa, Adeus " + user + " :)");
                    System.out.println("------------------------------");
                    calc = false;
                    break;

                default:
                    System.out.println("Ops! Algo deu errado, tente novamente :( ");
                    break;
            }
        }
        entrada.close();
    }
}
