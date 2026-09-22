package ADS.Atividade6;

public class Circulo implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        return 2 *  3.14 * raio;
    }

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }
}
