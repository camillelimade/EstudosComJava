package AtividadesClass;

import java.util.Scanner;

public class QuantCaracteres {
    // Escreva um programa que leia uma frase do usuário e conte
    // quantos caracteres ela possui (desconsiderando os espaços)
    public static void main(String[] args){
        System.out.println("Digite aqui uma frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String frase_tratada = frase.replace(" ", "");
        // essa frase_tratada foi definida para substituir as frases com espaços abertos, por espaços fechados
        System.out.println("A frase recebida sem essa quantidade de caracteres: " +  frase_tratada.length());

    }
}
