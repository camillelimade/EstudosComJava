package ADS.Atividade6;

public class Quadrado implements FiguraGeometrica {
    private double lado1;

    public Quadrado(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public double getArea() {
        return lado1 * lado1;
    }

    @Override
    public double getPerimetro() {
        return 4 *  lado1;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }
}
