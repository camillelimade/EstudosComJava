package Unidade_1_Camille;
import java.util.Scanner;
public class AtvCinco {
    public static void main(String[] args) {
        // 5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
        //por "*".
    Scanner  input = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String text = input.nextLine();
    String replacedChars1 = text.replace('e', '*');
    String replacedChars2 = replacedChars1.replace('E', '*');
    System.out.println("Essa é a palavra modificada: " + replacedChars2);
    }
}
