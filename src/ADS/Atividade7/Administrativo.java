package ADS.Atividade7;

public class Administrativo extends Assistente{
    private String turno;
    private float addNoturno;
    // noturnos
    public Administrativo(String nome, double salario, int numMatricula, String turno, float addNoturno) {
        super(nome, salario, numMatricula);
        this.turno = turno;
        this.addNoturno = addNoturno;
    }
    // diurnos
    public Administrativo(String nome, double salario, int numMatricula, String turno) {
        super(nome, salario, numMatricula);
        this.turno = turno;
    }

    @Override
    double ganhoAnual() {
        if (turno.equalsIgnoreCase("Noturno")){
            return (getSalario() + addNoturno) * 12;
        }else {
            return getSalario() * 12;
        }
    }

    @Override
    void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if (turno.equalsIgnoreCase("Noturno")){
            System.out.println("Adicional Noturno: " + addNoturno);
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
