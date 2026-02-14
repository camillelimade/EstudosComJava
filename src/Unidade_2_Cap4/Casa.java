package Unidade_2_Cap4;

import java.util.ArrayList;

public class Casa {
    ArrayList<Comodo> Comodos = new ArrayList<>();

    public Casa() {

    }

    public ArrayList<Comodo> getComodos() {
        return Comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        Comodos = comodos;
    }

    public void AddComodo(double tamanho, String nome) {
        Comodos.add(new Comodo(tamanho, nome));

        System.out.println("Comodo " + nome + " adicionado com sucesso!");
    }

    public static void Divisor() {
        System.out.println("-----------------------------------");
    }

    public static void ListarComodos(Casa casa) {
        Divisor();
        System.out.println("Listando comodos da casa solicitada: ");
        Divisor();
        for (Comodo comodo : casa.getComodos()) {
            System.out.println(comodo.getNome());
        }
    }

    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.AddComodo(100, "Mesa de jantar");
        casa1.AddComodo(2.64, "Cama de Casal");
        ListarComodos(casa1);

        Casa casaCeciCamille = new Casa();
        casaCeciCamille.AddComodo(120, "Escrivaninha");
        casaCeciCamille.AddComodo(50, "Cadeira de Escritório");
        ListarComodos(casaCeciCamille);
    }
}
