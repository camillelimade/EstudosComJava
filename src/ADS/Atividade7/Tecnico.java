package ADS.Atividade7;

public class Tecnico extends Assistente{
    public float bonusSalarial;

    public Tecnico(String nome, double salario, int numMatricula, float bonusSalarial) {
        super(nome, salario, numMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    double ganhoAnual() {
        return (getSalario() + bonusSalarial) * 12;
    }

    @Override
    void exibeDados() {
        super.exibeDados();
        System.out.println("Bonus salarial: " + bonusSalarial);
    }
}
