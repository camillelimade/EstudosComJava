package Unidade_1_Camille;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AtvSeis {
    public static void main(String[] args) {
        //6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
        //seguida, peça um nome ao usuário e diga se ele está ou não no array

        String[] nomes = {"Maria", "João", "Carlos", "Ana", "Beatriz"}; // Nome do seis: [Maria, João, Carlos, Ana, Beatriz]
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome para a verificação: ");
        String seuNome = leitor.nextLine();

        for (int i = 0; i <= nomes.length - 1; i++) {
            boolean verifica = seuNome.equalsIgnoreCase(nomes[i]);
            if (verifica) {
                System.out.println(nomes[i] + " foi encontrado :)");
            } else if (verifica == false && i == nomes.length-1) {
                System.out.println("Não encontramos " + seuNome + " :(");
            }
        }
    }
}
