package Unidade_2_Cap5;

import java.util.Scanner;

public class VerificaIdade {
    private double idade;

    public VerificaIdade(double idade) {
        this.idade = idade;
    }

    public void verificadorDeMaior() throws IdadeInvalidaException{
        if (idade >= 18){
            System.out.println("Maior de idade! ");
        }else{
            throw new IdadeInvalidaException("Você é menor de idade! ");
        }

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        double idadeDigitada = leitor.nextDouble();

        VerificaIdade idadeExemplo = new VerificaIdade(idadeDigitada);
        try{
            idadeExemplo.verificadorDeMaior();
        }catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}
