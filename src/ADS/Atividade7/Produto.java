package ADS.Atividade7;
public class Produto {
    private String nomeloja;
    private float preco;
    private String descricao;
    // recebe nada
    public Produto(){

    }
    // recebe todos os atributos
    public Produto(String nomeloja, float preco, String descricao) {
        this.nomeloja = nomeloja;
        this.preco = preco;
        this.descricao = descricao;
    }
    // recebe apenas a descrição
    public Produto(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return "Produto de informática: " + this.descricao;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
