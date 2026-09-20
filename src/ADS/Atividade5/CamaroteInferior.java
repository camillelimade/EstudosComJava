package ADS.Atividade5;

public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(float valor, float valorAdd, String localizacao) {
        super(valor, valorAdd);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void imprimeLocalizacao(){
        System.out.println("Localização: " + this.localizacao);
    }

    public static void main(String[] args) {
        CamaroteInferior cam = new CamaroteInferior(
                500,
                50,
                "Primeiro Andar"
        );
        cam.imprimeLocalizacao();
    }
}
