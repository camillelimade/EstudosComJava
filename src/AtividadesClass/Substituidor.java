package AtividadesClass;

import java.util.Scanner;

public class Substituidor {
    public static void main(String[] args) {
        // Faça um programa que leia uma String e faça a substituição de todas as letras "a" por "@"
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra: ");
        String texto = leitor.nextLine();

        String textoTratado = texto.replace("a", "@");
        System.out.println("Essa é sua palavra pós tratamento: " + textoTratado);

    }
}
