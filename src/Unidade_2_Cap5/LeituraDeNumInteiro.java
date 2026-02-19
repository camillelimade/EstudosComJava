package Unidade_2_Cap5;

import java.util.Scanner;

public class LeituraDeNumInteiro {
    public void divisor(){
        System.out.println("--------------------------------------");
    }
    public int lerNumeroInteiro() {
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido) {
            divisor();
            System.out.print("Digite um número inteiro: ");

            if (leitor.hasNextInt()) {
                num = leitor.nextInt();
                valido = true;
            } else {
                divisor();
                System.out.println("Erro! Isso não é um número inteiro.");
                leitor.next();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        LeituraDeNumInteiro leitura = new LeituraDeNumInteiro();
        int numero = leitura.lerNumeroInteiro();
        leitura.divisor();
        System.out.println("Esse é o seu número: " + numero);
        leitura.divisor();
    }
}
