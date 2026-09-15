package ADS.Atividade5;

public class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private float veloMedia;

    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float veloMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.veloMedia = veloMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVeloMedia() {
        return veloMedia;
    }

    public void setVeloMedia(float veloMedia) {
        this.veloMedia = veloMedia;
    }
    public void dados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Número de patas: " + getNumPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade média: " + getVeloMedia());
    }

    public static void main(String[] args) {
        Animal a = new Animal(
                "Gato",
                50,
                4,
                "Preto",
                "Minha casa",
                20
                );
        a.dados();
    }
}
