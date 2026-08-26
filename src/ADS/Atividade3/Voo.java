package ADS.Atividade3;

import java.util.Date;
import java.util.Scanner;

public class Voo {
    private int[] assentos;
    private int numero;
    private Date data;

    public Voo(int numero, Date data) {
        this.assentos = new int[100];
        this.numero = numero;
        this.data = data;
    }
    public int proximoLivre() {
        for (int posicao = 0; posicao < assentos.length; posicao++) {
            if (assentos[posicao] == 0) {
                return posicao + 1;
            }
        }
        return 0;
    }
    public boolean verifica(int assento) {
        if (assento < 1 || assento > 100) {
            return false;
        }
        return assentos[assento - 1] == 1;
    }
    public boolean ocupa(int assento) {
        if (assento < 1 || assento > 100) {
            return false;
        }
        if (assentos[assento - 1] != 0) {
            return false;
        }
        assentos[assento - 1] = 1;
        return true;
    }
    public int retornaVagas() {
        int quantidade = 0;
        for (int posicao = 0; posicao < assentos.length; posicao++) {
            if (assentos[posicao] == 0) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public int retornaVoo() {
        return numero;
    }
    public Date retornaData() {
        return data;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero do voo: ");
        int numeroVoo = entrada.nextInt();
        Date dataVoo = new Date();
        Voo meuVoo = new Voo(numeroVoo, dataVoo);

        int escolha;
        do {
            System.out.println("1. Consultar proxima cadeira livre");
            System.out.println("2. Verificar cadeira");
            System.out.println("3. Ocupar cadeira");
            System.out.println("4. Consultar vagas");
            System.out.println("5. Consultar numero do voo");
            System.out.println("6. Consultar data do voo");
            System.out.println("0. Sair");
            System.out.print("Digite uma opcao: ");
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    int cadeiraLivre = meuVoo.proximoLivre();

                    if (cadeiraLivre == 0) {
                        System.out.println("O voo esta lotado.");
                    } else {
                        System.out.println("A proxima cadeira livre e: " + cadeiraLivre);
                    }
                    break;
                case 2:
                    System.out.print("Digite o numero da cadeira: ");
                    int cadeiraConsulta = entrada.nextInt();

                    if (cadeiraConsulta < 1 || cadeiraConsulta > 100) {
                        System.out.println("Numero de cadeira invalido.");
                    } else if (meuVoo.verifica(cadeiraConsulta)) {
                        System.out.println("A cadeira esta ocupada.");
                    } else {
                        System.out.println("A cadeira esta livre.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o numero da cadeira: ");
                    int cadeiraEscolhida = entrada.nextInt();
                    if (meuVoo.ocupa(cadeiraEscolhida)) {
                        System.out.println("Cadeira ocupada com sucesso.");
                    } else {
                        System.out.println("Nao foi possivel ocupar essa cadeira.");
                    }
                    break;
                case 4:
                    int lugaresDisponiveis = meuVoo.retornaVagas();
                    System.out.println("Quantidade de vagas: " + lugaresDisponiveis);
                    break;
                case 5:
                    System.out.println("Numero do voo: " + meuVoo.retornaVoo());
                    break;
                case 6:
                    System.out.println("Data do voo: " + meuVoo.retornaData());
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (escolha != 0);
        entrada.close();
    }
}

