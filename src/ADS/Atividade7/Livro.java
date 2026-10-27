package ADS.Atividade7;
public class Livro extends Produto {
    private String autor;
    public Livro(String descricao, String autor) {
        super(descricao);
        this.autor = autor;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + ", " + autor;
    }
}
