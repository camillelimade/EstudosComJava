import java.util.ArrayList;

// importando a biblioteca de arrays para utilização
public class ArraysList {
    public static void main (String[] args){
        // Criação do ArrayList com o dado padrão Interger que pode ser modificado
        ArrayList<Integer> numeros = new ArrayList<>();
        // Adicionando elementos no Array até então vazio
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        // Acessando via indice
        System.out.println("Primeiro número do Array List: " + numeros.get(0));
        // Verificando o número de elementos armazenados
        System.out.println("O tamanho desse Array List númerico é atualmente: " + numeros.size());
        /* A vantagem na utilização de ArrayLists é sua dinamicidade no armazenamento autogerenciado de elementos */
    }
}
