package ADS.Atividade6;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 40);
        TrianguloP3 triangulo = new TrianguloP3(12, 10);
        CirculoP3 circulo = new CirculoP3(5);
        QuadradoP3 quadrado = new QuadradoP3(90, 90);
        System.out.println("----------------------------");
        System.out.println("Retangulo: ");
        System.out.println("Lado 1: " + retangulo.getL1());
        System.out.println("Lado 2: " + retangulo.getL2());
        System.out.println("Area: " + retangulo.area());
        retangulo.toString();
        System.out.println("----------------------------");
        System.out.println("Triangulo: ");
        System.out.println("Base :" + triangulo.getBase());
        System.out.println("Altura :" + triangulo.getAltura());
        System.out.println("Area: " + triangulo.area());
        triangulo.toString();
        System.out.println("----------------------------");
        System.out.println("Circulo: ");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Diametro: " + circulo.getDiametro());
        circulo.toString();
        System.out.println("----------------------------");
        System.out.println("Quadrado: ");
        System.out.println("Lados: " + quadrado.getL1());
    }
}
