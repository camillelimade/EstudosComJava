package ADS.Atividade5;

public class Peixe extends Animal {
    private String carac;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia, String carac) {
        super(nome, comprimento, numPatas, cor, ambiente, veloMedia);
        this.carac = carac;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }
    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + getCarac());
    }

    public static void main(String[] args) {
        Peixe p = new Peixe(
                "Tupula-Maré",
                30,
                0,
                "Azul",
                "Rio",
                15,
                "Pula muito"
        );
        p.dados();
    }
}

