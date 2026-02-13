package Unidade_2_Cap4;
/*
* 1. Crie uma classe Motor com atributos como potencia. Em seguida, crie a classe Carro que
compõe um Motor. No construtor de Carro, instancie um Motor. Demonstre em um método
que o Carro não funciona sem o Motor.
* */
public class Carro {
    private String cor;
    private String modelo;
    private Motor motor;

    public Carro(String cor, String modelo, float potenciaMotor) {
        this.cor = cor;
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }
    public void ligar() {
        if (motor == null){
            System.out.println("O carro não pode ligar sem um motor");
        }else {
            System.out.println("Carro ligado com motor de " + motor.getPotencia() + " cavalos!");
        }
    }
    public static void main(String[] args){
    Carro fuscao = new Carro("Azul", "Fusca", 300);
    fuscao.ligar();
    }
}
