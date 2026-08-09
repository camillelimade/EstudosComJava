package ADS.Aula02;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        // cria instancia de variavel de leitura
        Scanner leitor = new Scanner(System.in);
        // variaveis com valores centrais da questao
        int valorCompra, parcelas;
        // solicita e efetua a entrada do valor da compra
        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextInt();
        // solicita e efetua a entrada de quantidade de parcelas
        System.out.println("Digite o numero de parcelas (Ate 18 vezes): ");
        parcelas = leitor.nextInt();
        // cria novas variavéis para facilitar manipulação, e comparações nas condicionais
        int valorBase = valorCompra/ parcelas; // já divide o total pela quantidade de parcelas solicitada
        int resto = valorCompra % parcelas; // pega o que sobra da divisão acima, logo esses dois valores são separados
        // roda enquanto houverem parcelas roda
        for (int i = 0; i < parcelas; i++){
            if (i < resto){ // vai dizendo o valor das primeiras parcelas
                System.out.println("Parcela " + (i + 1) + ": " + valorBase + 1);
            }else { // diz o valor da última caso dê resultado quebrado
                System.out.println("Parcela quebrada " + (i + 1) + ": " + valorBase);
            }
        }
    }
}
