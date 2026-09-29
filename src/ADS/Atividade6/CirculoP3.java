package ADS.Atividade6;

public class CirculoP3 extends Figura{
    private double raio;

    @Override
    public String toString() {
        return "CirculoP3{" +
                "raio=" + raio +
                '}';
    }
    public double getDiametro(){
        return raio * 3.14 * 2;
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public CirculoP3(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 0;
    }
}
