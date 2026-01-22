package Unidade_1_Camille;

import java.util.Scanner;

public class AtvQuatro {
    public static void main(String[] args) {
        // 4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
        //desse número (de 1 a 10), usando um laço for.


        Scanner inteiro  = new Scanner(System.in);
        System.out.println("Digite um número para visualizar sua tabuada: ");
        int numEscolhido = inteiro.nextInt();
        inteiro.nextLine();
        int n = 0;
        for (int i = 0; i < 10; i++){
            n++;
            int result = numEscolhido * n;
            System.out.println(n +" x "+ numEscolhido +" = " + result);
        }
    }
}
