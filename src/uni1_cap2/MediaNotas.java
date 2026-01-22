package uni1_cap2;
import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args){
        Scanner leitor = new  Scanner(System.in);
        boolean verificador = true;
        while (verificador){
            System.out.println("Digite sua primeira nota: ");
            float nota1 = leitor.nextFloat();
            System.out.println("Digite sua segunda nota: ");
            float nota2 = leitor.nextFloat();
            float media = (nota1 + nota2) / 2;
            if (media >= 7.0){
                System.out.println(" Você foi aprovado, sua média foi " + media + " parabens!");
            } else if (media >= 5.9 && media <  6.9 ) {
                System.out.println("Você se encontra com " + media +" média necessária para passar de ano! Parabens :) ");
            }else {
                System.out.println("Infelizmente sua média: " + media + " é insuficiente para passar de ano :( ");
            }
            verificador = false;
        }
    }
}
