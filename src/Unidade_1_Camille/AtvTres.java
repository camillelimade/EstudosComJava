package Unidade_1_Camille;
import java.util.Scanner;
public class AtvTres {
    public static void main(String[] args) {
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
