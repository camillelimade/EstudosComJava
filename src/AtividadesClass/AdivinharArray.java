package AtividadesClass;

import java.util.ArrayList;
import java.util.Scanner;

public class AdivinharArray {
    public static void Divisor(){
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(30);
        numeros.add(45);
        numeros.add(50);
        boolean ligaDesliga = true;
        while (ligaDesliga){
            System.out.println("Qual número você acha que possue na lista? ");
            Divisor();
            Scanner leitor = new Scanner(System.in);
            int numUsuario = leitor.nextInt();
            leitor.nextLine();
            boolean Verificador = false;
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) == numUsuario){
                    Verificador = true;
                    break;
                }
            }
            if(Verificador){
                Divisor();
                System.out.println(numUsuario + " foi achado!");
                Divisor();
            }else {
                Divisor();
                System.out.println(numUsuario + " não foi encontrado!");
                Divisor();
            }
        }

    }
}
