import java.lang.reflect.Array;
// para utilizar Arrays é necessário importar sua biblioteca
public class Arrays {
    public static void main(String[] args) {

        /* Arrays são listas na programação, ou em outras palavras coleções de dados,
         * que permitem a organização ordenada por índices de informações no código */

        // Estrutura básica de um array com valores int
        int[] numeros = {1, 2, 3, 4, 5};

        // Acessando um item do Array
        System.out.println(numeros[3]); // saída: 4

        String[] palavras = {"palavras", "palavras", "palavras", "palavras", "palavraaas"};
        // Acessando o valor de índice 4 do Array do tipo String
        System.out.println(palavras[4]); // saída: palavraaas

        // Criando um novo Array com uma posição a mais
        int[] novoArray = new int[numeros.length + 1];

        // Copiando os valores do array antigo para o novo
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }

        // Adicionando novo elemento ao final do Array
        novoArray[novoArray.length - 1] = 6;

        // Substituindo o array antigo pelo novo
        numeros = novoArray;

        // Imprimindo o tamanho do array
        System.out.println(numeros.length); // saída: 6

        // Imprimindo o array atualizado
        System.out.print("Saída: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // Saída: [1, 2, 3, 4, 5, 6]
    }
}
