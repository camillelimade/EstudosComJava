package ADS.Atividade7;

import java.util.ArrayList;

public class MainProds {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();
        Produto P1 = new Produto("Loja PC infra", 500, "Placa de Vídeo");
        Produto P2 = new Produto("Loja PC infra", 221, "Teclado RGB");
        Produto P3 = new Produto("Loja PC infra", 50,  "Alcool Etilico");
        carrinho.add(P1);
        carrinho.add(P2);
        carrinho.add(P3);
        Mouse M1 = new Mouse("Mouse otico, saida USB. 1600 dpi", "com fio");
        M1.setNomeloja("Loja PC infra");
        M1.setPreco(98);
        Mouse M2 = new Mouse("Mouse ergonomico, saida USB. 400 dpi", "com fio");
        M2.setNomeloja("Loja PC infra");
        M2.setPreco(23);
        Mouse M3 = new Mouse("Mouse retratil, saida USB. 1200 dpi", "com fio");
        M3.setNomeloja("Loja PC infra");
        M3.setPreco(80);
        carrinho.add(M1);
        carrinho.add(M2);
        carrinho.add(M3);
        Livro L1 = new Livro("Barramentos e portas lógicas", "Placa mãe");
        L1.setNomeloja("Loja PC infra");
        L1.setPreco(57);
        Livro L2 = new Livro("Fundamentos de C e C++", "Leonardo Santos");
        L2.setNomeloja("Loja PC infra");
        L2.setPreco(32);
        carrinho.add(L1);
        carrinho.add(L2);
        for (Produto p: carrinho){
            System.out.println(p.getDescricao());
        }
    }
}
