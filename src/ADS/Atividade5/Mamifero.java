package ADS.Atividade5;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, veloMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    @Override
    public void dados(){
        super.dados();
        System.out.println("Alimento: " + getAlimento());
    }

    public static void main(String[] args) {
        Mamifero m = new Mamifero(
                "Gato",
                50,
                4,
                "Preto",
                "Minha casa",
                20,
                "Ração"
        );
        m.dados();
    }
}
