import java.util.ArrayList;

// importando a biblioteca de arrays para utilização
public class ArraysList {
    public static void main (String[] args){
        // Criação do ArrayList com o dado padrão Integer que pode ser modificado


        System.out.println(addNumeros(7));

    }
    static boolean addNumeros(int num){
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= numeros.size(); i++){
            System.out.println(num);
        }
        if (numeros.add(num) == true){
            System.out.println("Número salvo com sucesso! ;)");
        }
        return numeros.add(num);
    }
    }


