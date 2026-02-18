package Unidade_2_Cap4;

public abstract class CarroQuestao6 extends Veiculo {
    public CarroQuestao6(String modelo, int ano) {
        super(modelo, ano);
    }
    @Override
    public void mover() {
        System.out.println("O carro" + getAno() + " está sendo dirigido!");
    }
}
