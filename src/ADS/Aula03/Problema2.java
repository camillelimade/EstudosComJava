package ADS.Aula03;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // cria variavel de leitura
        String codigo; // cria variavel de escolha do tipo de prestração
        int pTotal = 0, vTotal = 0, valor, totalGeral = 0; // variaveis com o mesmo tipo, antecipação de declarações
        float prestacao; // prestração de cada parcela
        int transacoes = 15; // quantidade de parcelas visando um código reutilizavel a outras entradas
        for (int i = 1; i <= transacoes;){ // percorre as 15 transações, seu tipo de pagamento e preço
            System.out.println("Digite o código de transação (V ou P) "); // solicita tipo de transação
            codigo = leitor.nextLine(); // recebe o tipo
            // condicional que verifica se a entrada está de acordo com as alternativas de codigo, ignora se está em caixa alta ou não (considera V ou v, e P ou p)
            if (codigo.equalsIgnoreCase("V") || codigo.equalsIgnoreCase("P")){
                System.out.println("Digite o valor da transação: "); // solicita o valor
                valor = leitor.nextInt(); // recebe valor int
                leitor.nextLine(); // limpa o leitor, prevenção de bug da sintaxe
                if (codigo.equalsIgnoreCase("V")){
                    vTotal += valor; // se for v, acumula os valores a vista
                }else {
                    pTotal += valor; // se for p, acumula os valores a prazo
                }
                totalGeral += valor; // acumula os valores de v e de p
                i++; // auto incrementa a variavel contadora, continua o loop
            }
        }
        // conjunto das saídas requeridas, com descrição. De acordo com o enunciado
        prestacao = (float)pTotal / 3;
        System.out.println("Esse é o valor das compras a vista: " + vTotal);
        System.out.println("Esse é o valor das compras a prazo: " + pTotal);
        System.out.println("Valor total de todas as compras: " + totalGeral);
        System.out.println("Valor da primeira prestação (3x sem juros): " + prestacao);
    }
}
