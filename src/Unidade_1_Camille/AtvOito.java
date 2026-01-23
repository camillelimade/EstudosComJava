package Unidade_1_Camille;

import java.util.Scanner;

public class AtvOito {
    public static void main(String[] args) {
        //8. Crie um programa que exiba um menu repetitivo com as opções:
        //1 - Dizer "Olá"
        //2 - Dizer "Tchau"
        //3 - Encerrar
        //O menu deve continuar aparecendo até que o usuário escolha a opção 3.
        boolean menu = true;
        while (menu) {
            System.out.println("Seja bem vindo(a) ao nosso menu: ");
            System.out.println("1 - Dizer 'Olá'");
            System.out.println("2 - Dizer 'Tchau'");
            System.out.println("3 - Encerrar");
            System.out.println("Escolha uma opção: ");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Olá");
                    System.out.println("  ");
                    System.out.println("  ");
                    break;
                case 2:
                    System.out.println("Tchau");
                    System.out.println("  ");
                    System.out.println("  ");
                    break;
                case 3:
                    System.out.println("Você encerrou o programa! :(");
                    menu = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida! ");
            }
        }
    }
}
