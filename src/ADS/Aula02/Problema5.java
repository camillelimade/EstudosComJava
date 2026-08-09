package ADS.Aula02;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        // cria instancia de leitura
        Scanner entrada = new Scanner(System.in);
        // cria array
        int[] jogadores = new int[16];
        // variaveis responsaveis por cada jogador
        // loop for que percorre o array verificando os jogadores Zhao (1) e Liu (7)
        for (int i = 0; i < 16; i++){
            jogadores[i] = entrada.nextInt();
        }
        int pos1 = 1, pos7 = 1;
        // oitavas
        if ((pos1 - 1) / 2 == (pos7 - 1) / 2){
            System.out.println("Oitavas");
        } else if ((pos1 - 1) / 4 == (pos7 - 1) / 4) {
            System.out.println("Quartas");
        } else if ((pos1 - 1) / 8 == (pos7 - 1) / 8) {
            System.out.println("Semifinal");
        }else {
            System.out.println("Final");
        }
    }
}
