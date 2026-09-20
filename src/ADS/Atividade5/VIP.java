package ADS.Atividade5;

public class VIP extends Ingresso {
    private float valorAdd;



    public VIP(float valor, float valorAdd) {
        super(valor);
        this.valorAdd = valorAdd;
    }

    public float getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(float valorAdd) {
        this.valorAdd = valorAdd;
    }

    @Override
    public void imprimeValor(){
        float result = super.valor + valorAdd;
        System.out.println("Ingresso VIP custa: " + result);
    }

    public static void main(String[] args) {
      VIP v = new VIP(
              500,
              50
      );
      v.imprimeValor();
    }
}
