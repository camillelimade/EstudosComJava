package ADS.Atividade7;
public class Mouse extends Produto{
    private String tipo;
    public Mouse(String descricao, String tipo) {
        super(descricao);
        this.tipo = tipo;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + ", " +  tipo;
    }
}
