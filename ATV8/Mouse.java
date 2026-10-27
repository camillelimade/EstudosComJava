package atividade7q2;

public class Mouse extends Produto{
    public String tipo;

    public Mouse(String descricao, String tipo){
        super(descricao);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "| Tipo:" + tipo;
    }

}
