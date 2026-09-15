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
    void dadosMamifero(){
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Número de patas: " + getNumPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade média: " + getVeloMedia());
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
        m.dadosMamifero();
    }
}
