package atividade7q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Produto> carrinho = new ArrayList<>();

        Mouse mouse1 = new Mouse("Mouse otico, saida USB. 1600 dpi", "com fio");
        mouse1.setNomeloja("Loja1");
        mouse1.setPreco(70.0);

        Livro livro1 = new Livro("Java para iniciantes", "autor");
        livro1.setNomeloja("Loja2");
        livro1.setPreco(55.0);

        carrinho.add(mouse1);
        carrinho.add(livro1);

        for (Produto p: carrinho){
            System.out.println(p.getDescricao());
        }
    }
}
