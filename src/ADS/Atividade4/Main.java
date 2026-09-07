package ADS.Atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Menu de operações: ");
        System.out.println("0. Encerrar programa");
        System.out.println("\n1. Cadastrar pessoa");
        System.out.println("\n2. Cadastrar livro");
        System.out.println("\n3. Novo empréstimo");
        System.out.println("Digite a opção desejada: ");
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu();
        int op = scanner.nextInt();
        scanner.nextLine();

        while (op != 0) {
            switch (op) {
                case 0:
                    op = 0;
                    continue;
                case 1:
                    System.out.println("Cadastrando nova pessoa...");
                    System.out.println("Digite o nome completo: ");
                    String nome = scanner.nextLine();
                    System.out.println("\nDigite seu CPF");
                    String cpf = scanner.nextLine();
                    System.out.println("\nDigite seu telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.println("\nDigite seu e-mail: ");
                    String email = scanner.nextLine();
                    Pessoa pessoa = new Pessoa(nome, cpf, telefone, email);
                    pessoas.add(pessoa);
                    System.out.println("Pessoa " + pessoa.getNomeCompleto() + ", criada com sucesso!");
                    break;
                case 2:
                    System.out.println("Cadastrando novo livro...");
                    System.out.println("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite os autores do livro: ");
                    String autores = scanner.nextLine();
                    System.out.println("Digite o ano do livro: ");
                    String ano = scanner.nextLine();
                    System.out.println("Digite a edição do livro: ");
                    String edicao = scanner.nextLine();
                    System.out.println("Digite a editora do livro: ");
                    String editora = scanner.nextLine();
                    Livro livro = new Livro(titulo, autores, ano, edicao, editora);
                    livros.add(livro);
                    System.out.println("Livro " + livro.getTitulo() + ", cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Cadastrando novo empréstimo...");
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada. ");
                        break;
                    }
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado. ");
                        break;
                    }
                    System.out.println("Quem vai realizar o empréstimo? ");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNomeCompleto());
                    }
                    int pessoaEsc = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Qual livro deve ser emprestado? ");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(i + " - " + livros.get(i).getTitulo());
                    }
                    int livrosEsc = scanner.nextInt();
                    scanner.nextLine();
                    Pessoa pessoaEmprest = pessoas.get(pessoaEsc);
                    Livro livroEmprest = livros.get(livrosEsc);
                    Emprestimo emprest = new Emprestimo(
                            pessoaEmprest,
                            livroEmprest
                    );
                    emprestimos.add(emprest);
                    System.out.println("Empréstimo realizado com sucesso!");
                    break;
                default:
                    System.out.println("opção inválida, tente novamente!");
            }
            menu();
            op = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
