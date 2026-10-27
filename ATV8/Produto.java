package atividade7q2;

public class Produto {
    public String nomeloja;
    public double preco;
    public String descricao;

    public Produto(){
        this.descricao = "Produto de informatica";
    }

    public Produto(String descricao){
        this.descricao = descricao;
    }

    public String getNomeloja(){
        return nomeloja;
    }

    public void setNomeloja(String nomeloja){
        this.nomeloja = nomeloja;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getDescricao(){
        return descricao;
    }
}
