package ADS.Atividade5;

public class Normal extends Ingresso{
    public Normal(float valor) {
        super(valor);
    }
    @Override
    public void imprimeValor(){
        System.out.println("Ingresso Normal custa: " + super.valor);
    }

    public static void main(String[] args) {
        Normal n = new Normal (
                400
        );
        n.imprimeValor();
    }
}
