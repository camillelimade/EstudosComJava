package atividade7q2;

public class Livro extends Produto{
    public String autor;

    public Livro(String descricao, String autor){
        super(descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "| Autor:" + autor;
    }
}
