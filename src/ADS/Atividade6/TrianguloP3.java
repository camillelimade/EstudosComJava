package ADS.Atividade6;

public class TrianguloP3 extends Figura{
    private double base;
    private double altura;

    public TrianguloP3(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area(){
        return base * altura;
    }
    @Override
    public String toString() {
        return "TrianguloP3{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
