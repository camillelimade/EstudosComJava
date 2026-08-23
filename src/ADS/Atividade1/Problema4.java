package ADS.Atividade1;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // defininção da variavel distancia
        int distancia;
        // solicita entrada da distancia do lançamento
        System.out.println("Digite a distância: (em cm)");
        distancia = leitor.nextInt();
        // condicional que compara a distancia inserida pelo usuário com, as do enunciado para retornas quantos pontos o lançamento vale
        if (distancia <= 800){
            System.out.println("1 Ponto");
        } else if (distancia > 800 && distancia <= 1400) {
            System.out.println("2 Pontos");
        } else if (distancia > 1400 && distancia <= 2000) {
            System.out.println("3 Pontos");
        }else {
            System.out.println("Distância inválida");
        }
    }
}
