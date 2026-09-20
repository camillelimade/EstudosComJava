package ADS.Atividade5;

public class Ingresso {
    float valor;
    public void imprimeValor(){
        System.out.println("Ingresso custa: " + valor);
    }
    public Ingresso(float valor) {
        this.valor = valor;
    }
}
