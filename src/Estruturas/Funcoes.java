package Estruturas;

public class Funcoes {
    public static void main (String[] args){
        minhaPrimeiraFuncao();
        System.out.println(calcSoma(5, 6) );
        System.out.println(calcDiv(5, 6) );
        System.out.println(calcMult(5, 6) );
        System.out.println(calcSub(5, 6) );
    }
    // Para a criação de funções primeiro se deve sair do escopo da classe principal
    static void minhaPrimeiraFuncao(){
        System.out.println("Imprimindo uma função simples :)");
    }
    static int calcSoma(int a, int b){
        int soma = a + b;
        return soma;
    }
    static int calcMult(int a, int b){
        int mult = a * b;
        return mult;
    }
    static float calcDiv(int a, int b){
        float div = a / b;
        return div;
    }
    static int calcSub(int a, int b){
        int sub = a - b;
        return sub;
    }
}
