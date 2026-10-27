package ADS.Atividade7;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProdutos {
    public MainProdutos() {
    }

    int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("0. Sair");
        System.out.println("1. Produto");
        System.out.println("2. Mouse");
        System.out.println("3. Livro");
        int op =  sc.nextInt();
        if (op == 1){
            System.out.println("Produto sendo gerado...");
            return 1;
        }else if (op == 2){
            System.out.println("Mouse sendo gerado...");
            return 2;
        }else if (op == 3){
            System.out.println("Livro sendo gerado...");
            return 3;
        }else if (op == 0){
            System.out.println("Saindo...");
            return 0;
        }else {
            System.out.println("Opção inválida, tente novamente.");
            return -1;
        }
    }

    public static void main(String[] args) {
        MainProdutos rodando = new MainProdutos();
        ArrayList<Produto> Carrinho =  new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean execute = true;
        while (execute){
            switch (rodando.menu()){
                case 0:
                    return;
                case 1:
                    System.out.println("Digite o nome da loja: ");
                    String lojaProd = input.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    float precoProd = input.nextFloat();
                    input.nextLine();
                    System.out.println("Digite a descrição do produto: ");
                    String descProd = input.nextLine();
                    Produto produto = new Produto(lojaProd, precoProd, descProd);
                    System.out.println("Produto " + descProd + " criado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o tipo do mouse: ");
                    String tipoMouse = input.nextLine();
                    System.out.println("Digite a descrição do mouse: ");
                    String descMouse = input.nextLine();
                    Mouse mouse = new Mouse(descMouse, tipoMouse);
                    System.out.println(mouse.getDescricao() + "Mouse criado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o autor do livro: ");
                    String autorLiv = input.nextLine();
                    System.out.println("Digite a descrição do livro: ");
                    String descLiv = input.nextLine();
                    Livro livro = new Livro(descLiv, autorLiv);
                    System.out.println("Livro " + descLiv + " criado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida tente novamente...");
                    break;
            }

        }
    }
}
