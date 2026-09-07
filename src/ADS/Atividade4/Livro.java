package ADS.Atividade4;

public class Livro {
    private String titulo;
    private String autores;
    private String ano;
    private String edicao;
    private String editora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Livro(String titulo, String autores, String ano, String edicao, String editora) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.edicao = edicao;
        this.editora = editora;
    }
}
