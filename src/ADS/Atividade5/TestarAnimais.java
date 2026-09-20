package ADS.Atividade5;

public class TestarAnimais{
    public static void main(String[] args) {
        Mamifero m = new Mamifero(
                "Gato",
                70,
                4,
                "Branco",
                "Domestico",
                20,
                "Ração"
        );
        Peixe p = new Peixe(
                "Piaba",
                12,
                0,
                "Azul",
                "Água doce",
                25,
                "Podem morder"
        );
        m.dados();
        p.dados();
    }
}
