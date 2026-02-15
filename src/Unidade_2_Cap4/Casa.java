package Unidade_2_Cap4;

import java.util.ArrayList;

public class Casa {
    private ArrayList<Comodo> comodos = new ArrayList<>();
    public void addComodo(String nome, double tamanho) {
        comodos.add(new Comodo(tamanho, nome));
        System.out.println("Cômodo " + nome + " adicionado!");
    }
    public void listarComodos() {
        System.out.println("---- CÔMODOS DA CASA ----");
        for (Comodo c : comodos) {
            System.out.println(c.getNome() + " - " + c.getTamanho() + " m²");
        }
    }
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.addComodo("Sala", 20);
        casa.addComodo("Quarto", 12);
        casa.addComodo("Cozinha", 10);
        casa.listarComodos();
    }
}
