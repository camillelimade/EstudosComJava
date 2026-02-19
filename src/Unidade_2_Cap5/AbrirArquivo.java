package Unidade_2_Cap5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AbrirArquivo {
    // 10. Crie uma função abrirArquivo(String caminho) que tente abrir um arquivo de texto e ler
    // seu conteúdo. Caso o arquivo não exista, capture a exceção e informe o erro ao usuário
    public static void main(String[] args){
        Scanner receba = new Scanner(System.in);
        System.out.println("Digite o caminho de seu arquivo: ");
        String caminho =  receba.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

}
