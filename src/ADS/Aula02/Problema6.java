package ADS.Aula02;
import java.util.Scanner;
public class Problema6 {
    public static void main(String[] args) {
        // instancia de leitura
        Scanner scanner = new Scanner(System.in);
        // declara variaveis do primeiro retangulo
        float x01, y01, x11, y11;
        // declara variaveis do segundo retangulo
        float x02, y02, x12, y12;
        // leitura do primeiro retangulo
        System.out.println("Digite as coordanadas do primeiro retangulo: ");
        System.out.println(" ");
        System.out.println("Canto inferior esquerdo: (x01, y01)");
        System.out.println("Digite x01: ");
        x01 = scanner.nextInt();
        System.out.println("Digite y01: ");
        y01 = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Canto superior direito: (x11, y11)");
        System.out.println("Digite x11: ");
        x11 = scanner.nextInt();
        System.out.println("Digite y11: ");
        y11 = scanner.nextInt();
        // leitura do segundo retangulo
        System.out.println("Digite as coordenadas do segundo retangulo: ");
        System.out.println("Canto inferior esquerdo: (x02, y02)");
        System.out.println("Digite x02: ");
        x02 = scanner.nextInt();
        System.out.println("Digite y02: ");
        y02 = scanner.nextInt();
        System.out.println("Canto superior direito: (x12, y12)");
        System.out.println("Digite x12: ");
        x12 = scanner.nextInt();
        System.out.println("Digite y12: ");
        y12 = scanner.nextInt();
        if (x11 < x02 || // retangulo 1 esta a esquerda do retangulo 2
                x12 < x01 || // retangulo 2 esta a esquerda do retangulo 1
                y11 < y02 || // retangulo 1 esta abaixo do retangulo 2
                y12 < y01 // retangulo 2 esta abaixo do retangulo 1
        ){
            System.out.println("Os retangulos NAO se interceptam");
        }else {
            System.out.println("Os retangulos SE INTERCEPTAM! ");
        }
    }

}
