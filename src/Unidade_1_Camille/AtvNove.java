package Unidade_1_Camille;

import java.util.Scanner;

public class AtvNove {
    public static void main(String[] args){
        //9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
        //nome e o último nome separadamente.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diga seu nome inteiro: ");
        String nomeInteiro = entrada.nextLine();
        String[] partes =  nomeInteiro.split(" ");
        String primeiroNome = partes[0];
        String sobreNome = partes[1];
        System.out.println("Esse é seu primeiro nome: " + primeiroNome);
        System.out.println("Esse é seu primeiro sobrenome " +  sobreNome);
        // Só não serve muito pra pessoas com nomes compostos 👀
    }
}
