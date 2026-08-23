package ADS.Atividade2;

public class Problema3 {
    public static void main(String[] args) {
        int anos = 0; // cria variavel quantitativa de anos
        double chico = 1.50,  ze = 1.10; // altura dos dois
        while (ze < chico) { // percorre até que o zé seja maior que o chico
            chico += 0.02; // o quanto cresce a altura do chico
            ze += 0.03; // o quanto cresce a altura do ze
            anos++; // quantas vezes o loop roda == quanto tempo passa
        }
        // resposta do enunciado, quanto tempo leva pro ze passar o chico e qual a altura deles
        System.out.println("Altura chico: " + chico);
        System.out.println("Altura ze: " + ze);
        System.out.println("Demorou " + anos + " anos");
    }
}
