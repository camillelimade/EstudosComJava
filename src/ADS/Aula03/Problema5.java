package ADS.Aula03;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // variavel de entrada
        float salarioMaria, salarioJoao; // salarios dos dois
        float poupancaMaria, poupancaJoao; // poupanças que vão receber os salarios em breve
        int meses = 0; // quantidade de meses
        System.out.println("Digite o salario de Maria: "); // solicita salario da Maria
        salarioMaria = input.nextFloat(); // recebe
        salarioJoao = salarioMaria / 3; // cria salario do joao a partir do da maria, de acordo com o enunciado
        // guarda o dinheiro dos dois nas poupanças
        poupancaMaria = salarioMaria;
        poupancaJoao = salarioJoao;
        // enquanto poupança do Joao for abaixo da de maria, veremos ele tentar passar a dela
        while (poupancaJoao < poupancaMaria){
            poupancaMaria += poupancaMaria *  0.01; // acrescimo de crescimento do de Maria ao longo de um mes, de acordo com o enunciado
            poupancaJoao += poupancaJoao * 0.03; // acrescimo de crescimento do de Maria ao longo de um mes, de acordo com o enunciado
            meses++; // conta em quantos meses isso acontece
        }
        System.out.println("Mes: " + meses + ", Maria: " + poupancaMaria + " | João: " + poupancaJoao); // solta as informações que o loop acumula
    }
}