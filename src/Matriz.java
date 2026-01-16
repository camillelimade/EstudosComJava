import java.util.ArrayList;

public class Matriz {
    public static void main(String[] args){
        // Arrays multidirecionais (Matriz)
        // Declarando uma Matriz (Array 2D)
        int [][] matriz = new int[2][3];

        // Inicialização
        int [][] matrizl = {
                {1,2,3}, // essa linha tem indice 0
                {4,5,6}, // essa linha tem indice 1
        };
        // Acesso a linha 0, coluna 2
        System.out.println(matrizl [0][2]);
        // seu resultado será 3, pois os indices de uma matriz são contados a partir de zero
        for(int i = 0; i < matrizl.length; i++){
            // matrizl.lenght diz respeito a quantidade de linhas da matriz
            for (int c = 0; c < matrizl[i].length; c++){
                System.out.print(matrizl[i][c] + " ");
                /*
                Saída:
                 1 2 3
                 4 5 6
                */
            }
            System.out.println();
        }
    }
}
