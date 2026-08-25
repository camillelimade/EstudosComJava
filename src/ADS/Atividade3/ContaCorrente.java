package ADS.Atividade3;

import java.util.Scanner;

public class ContaCorrente {
    private String titular;
    private int conta;
    private int agencia;
    private float saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String titular, int conta, int agencia, float saldo) {
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public void depositar(float valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado, na conta " + getConta());
        exibirExtrato();
    }

    public void transferir(ContaCorrente contaFinal, float valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            contaFinal.saldo += valor;
            System.out.println("Conta origem");
            exibirExtrato();
            System.out.println("Conta final");
            contaFinal.exibirExtrato();
        } else {
            System.out.println("A transferencia é maior que o saldo disponível, tente novamente");
        }
    }

    public void exibirExtrato() {
        System.out.println("--------------------------");
        System.out.println("Informações de Extrato");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + conta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("--------------------------");
    }

    public String menu() {
        Scanner entradaMenu = new Scanner(System.in);
        System.out.println("Selecione uma opção: ");
        System.out.println("Depositar");
        System.out.println("Transferir");
        System.out.println("Digite a operação desejada: ");
        return entradaMenu.nextLine();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcaoConta;
        float valor = 0;
        ContaCorrente controller = new ContaCorrente();
        ContaCorrente A = new ContaCorrente("Alana - Conta A", 1, 0004, 1300);
        ContaCorrente B = new ContaCorrente("Beto - Conta B", 2, 0006, 1900);
        ContaCorrente C = new ContaCorrente("Cecilia - Conta C", 7, 0021, 21000);

        System.out.println("Escolha sua conta: ");
        opcaoConta = leitor.nextInt();
        leitor.nextLine();
        float valorDep = 0;
        float valorTrans = 0;
        String opcaoMenu = controller.menu();
        switch (opcaoConta) {
            case 1:
                if (opcaoMenu.equalsIgnoreCase("Depositar")) {
                    System.out.println("Digite o valor do depósito: ");
                    valorDep = leitor.nextFloat();
                    A.depositar(valorDep);
                } else if (opcaoMenu.equalsIgnoreCase("Transferir")) {
                    System.out.println("Digite o valor de transferencia: ");
                    valorTrans = leitor.nextFloat();
                    A.transferir(B, valorTrans);
                }
                break;
            case 2:
                if (opcaoMenu.equalsIgnoreCase("Depositar")) {
                    System.out.println("Digite o valor do depósito: ");
                    valorDep = leitor.nextFloat();
                    B.depositar(valorDep);
                } else if (opcaoMenu.equalsIgnoreCase("Transferir")) {
                    System.out.println("Digite o valor de transferencia: ");
                    valorTrans = leitor.nextFloat();
                    B.transferir(C, valorTrans);
                }
                break;
            case 3:
                if (opcaoMenu.equalsIgnoreCase("Depositar")) {
                    System.out.println("Digite o valor do depósito: ");
                    valorDep = leitor.nextFloat();
                    C.depositar(valorDep);
                } else if (opcaoMenu.equalsIgnoreCase("Transferir")) {
                    System.out.println("Digite o valor de transferencia: ");
                    valorTrans = leitor.nextFloat();
                    C.transferir(A, valorTrans);
                }
                break;

        }
    }
}
