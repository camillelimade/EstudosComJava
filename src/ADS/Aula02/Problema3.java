package ADS.Aula02;
// posso detalhar melhor
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        int h, p, f, d;
        int distanciaFug, distanciaPol;
        // instancia de variavel de leitura
        Scanner leitura = new Scanner(System.in);
        // solicita e efetua da entrada da posição do helicoptero
        System.out.println("Digite onde o helicoptero está: ");
        h = leitura.nextInt();
        // solicita e efetua da entrada da posição do policial
        System.out.println("Digite onde o policial está: ");
        p = leitura.nextInt();
        // solicita e efetua da entrada da posição do fugitivo
        System.out.println("Digite onde o fugitivo está: ");
        f = leitura.nextInt();
        // solicita e efetua da entrada da direção
        System.out.println("Digite a direção (-1 horario, 1 anti-horario): ");
        d = leitura.nextInt();
        // condicional que indica a direção é horario ou antihorario
        if (d == 1){
            distanciaFug = (h - f + 16) % 16;
            distanciaPol = (p - f + 16) % 16;
        } else {
          distanciaFug = (f - h + 16) % 16;
          distanciaPol = (f - p + 16) % 16;
        }
        if (distanciaPol <= distanciaFug){
            System.out.println("N ");
        }else {
            System.out.println("S ");
        }
    }
}
