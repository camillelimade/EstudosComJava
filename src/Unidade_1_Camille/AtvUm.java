package Unidade_1_Camille;

public class AtvUm {
    public static void main (String[] args){
        // 1. Escreva um programa Java que use os operadores lógicos para verificar se um
        //número está entre 10 e 20 (inclusive). Use int numero = 15;.
        int numero = 15;
        if (numero >= 10 && numero <= 20){
            System.out.println("O número " + numero + ", está entre 10 e 20.");
        }else{
            System.out.println("O número " + numero + " não está entre 10 e 20");
        }
    }
}
