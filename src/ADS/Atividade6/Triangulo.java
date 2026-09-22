package ADS.Atividade6;

public class Triangulo implements FiguraGeometrica{
    private double altura;
    private double base;
    private double lado1;
    private double lado2;

    public Triangulo(double altura, double base, double lado1, double lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        return (base *  altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return lado1 + lado2 + base;
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }
}
