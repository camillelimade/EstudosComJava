package Unidade_2_Cap4;

public class Bicicleta extends Veiculo {

    public Bicicleta(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta " + getModelo() + "está sendo pedalada!");
    }
}
