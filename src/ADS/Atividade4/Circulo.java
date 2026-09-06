package ADS.Atividade4;

import javax.crypto.spec.PSource;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getArea(){
        return Math.PI * (this.raio* this.raio);
    }
    public double getCircunferencia(){
        return 2 * Math.PI * this.raio;
    }
    public double aumentarRaio(double percentual){
        return this.raio += this.raio * (percentual / 100.0);
    }
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(15.5);
        System.out.printf("A área do círculo é: " + novoCirculo.getArea());
        System.out.printf("\nA circunferencia do circulo é: " + novoCirculo.getCircunferencia());
        System.out.printf("\nAumentando o raio do circulo, fica: " + novoCirculo.aumentarRaio(10));
    }
}
