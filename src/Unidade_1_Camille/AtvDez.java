package Unidade_1_Camille;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AtvDez {
    public static void main(String[] args){
        //10. Escreva um programa que leia uma frase e conte quantas palavras ela possui
        //(considere as palavras separadas por espaços).
        Scanner leitorDeFrases = new Scanner(System.in);
        System.out.println("Digite aqui sua frase: ");
        String frase = leitorDeFrases.nextLine();
        String[] partes = frase.split(" ");
        System.out.println("Sua frase possui: " + partes.length + " palavras");

    }
}
