package ADS.Atividade5;

public class CamaroteSuperior extends VIP{
    private float valorAddVIP;

    public CamaroteSuperior(float valor, float valorAdd, float valorAddVIP) {
        super(valor, valorAdd);
        this.valorAddVIP = valorAddVIP;
    }
    @Override
    public void imprimeValor(){
        float result = valor + getValorAdd() + valorAddVIP;
        System.out.println("Ingresso Camarote Superior VIP custa: " + result);
    }

    public static void main(String[] args) {
        CamaroteSuperior cam2 = new CamaroteSuperior(
                700,
                50,
                100
        );
        cam2.imprimeValor();
    }
}
