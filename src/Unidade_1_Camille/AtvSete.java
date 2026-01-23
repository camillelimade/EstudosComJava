package Unidade_1_Camille;

import java.util.Scanner;

public class AtvSete {
    public static void main(String[] args) {
        // 7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
        //utilizando o laço for.
        //Exemplo: Entrada = 5 Saída = 120

        // Nesse problema eu tive um pouco de dificuldade e tive que pedir ajuda e pesquisar, cá está o resultado 👍
        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o número para visualizar seu fatorial: ");
        int num = input2.nextInt();
        input2.nextLine();

        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;

        }
        System.out.println(fatorial);
    }
    }

