package ADS.Atividade5;

public class Normal extends Ingresso{
    public Normal(float valor) {
        super(valor);
    }
    @Override
    public float imprimeValor(){
        System.out.println("Ingresso Normal custa: " + super.valor);
        return 0;
    }

    public static void main(String[] args) {
        Normal n = new Normal (
                400
        );
        n.imprimeValor();
    }
}
