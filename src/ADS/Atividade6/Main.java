package ADS.Atividade6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quadrado--------------------");
        System.out.println("Digite o valor do lado do quadrado: ");

        double ladoQuad  = leitor.nextDouble();
        System.out.println("Circulo--------------------");
        System.out.println("Digite o raio do circulo: ");
        double raio  = leitor.nextDouble();

        System.out.println("Triangulo--------------------");
        System.out.println("Digite o valor da altura do triangulo: ");
        double alturaTri = leitor.nextDouble();
        System.out.println("Digite o valor da base do triangulo: ");
        double baseTri = leitor.nextDouble();
        System.out.println("Digite o valor do lado 1 do triangulo: ");
        double l1Tri = leitor.nextDouble();
        System.out.println("Digite o valor do lado 2 do triangulo: ");
        double l2Tri = leitor.nextDouble();
        System.out.println("--------------------");

        Quadrado q = new Quadrado(
                ladoQuad
        );
        Circulo c = new Circulo(
                raio
        );
        Triangulo t = new Triangulo(
                alturaTri,
                baseTri,
                l1Tri,
                l2Tri
        );
        System.out.println("Nome da Figura: " + q.getNomeFigura());
        System.out.println("Esse é o perímetro: " + q.getPerimetro());
        System.out.println("Esse é a área: " + q.getArea());
        System.out.println("--------------------");
        System.out.println("Nome da Figura: " + c.getNomeFigura());
        System.out.println("Esse é o perímetro: " + c.getPerimetro());
        System.out.println("Esse é a área: " + c.getArea());
        System.out.println("--------------------");
        System.out.println("Nome da Figura: " + t.getNomeFigura());
        System.out.println("Esse é o perímetro: " + t.getPerimetro());
        System.out.println("Esse é a área: " + t.getArea());


    }
}
