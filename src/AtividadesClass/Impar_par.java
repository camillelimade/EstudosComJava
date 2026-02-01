package AtividadesClass;
import java.util.Scanner; // importando a biblioteca Scanner, para utilizar no código
public class Impar_par {
    public static void main(String[] args){
        // Comando da questão 1
        // Crie um programa que leia um número de usuário e informe se ele é par ou impar
        // Abaixo eu crio um objeto Scanner para ler do teclado (System.in)
        Scanner leitor = new Scanner(System.in);
        boolean sistemaVerificador = true;
        while (sistemaVerificador){
            System.out.println("Digite um número para a verificação: ");
            int num = leitor.nextInt();
            if(num%2==0){
                System.out.println( num + " é par");
            }else{
                System.out.println(num + " é impar");
            }
            sistemaVerificador = false;
        }
    }
}

