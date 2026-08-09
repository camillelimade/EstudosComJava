package ADS.Aula02;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        // criação da instancia da variavel de leitura out
        Scanner out = new Scanner(System.in);
        // variaveis de medidas do retangulo
        float b, t;
        // variaveis para obtenção do tamanho do corte via diferença
        float ladoEsq, ladoDir;
        // entrada dos dados de comprimento
        System.out.println("Comprimento de b: ");
        b = out.nextFloat();
        System.out.println("Comprimento de t: ");
        t = out.nextFloat();
        // obtenção do tamanho de cada lado via diferença de comprimentos
        ladoEsq = (b + t) * 70 / 2;
        ladoDir = (160 * 70) - ladoEsq;
        // condicional de comparação de valores que exibe cada resultado
        if (ladoEsq > ladoDir){
            System.out.println("Francisco (Lado Esquerdo maior)");
        }else if (ladoEsq == ladoDir){
            System.out.println("As areas são iguais");
        }else {
            System.out.println("Francisca (Lado Direito maior)");
        }
}
}
