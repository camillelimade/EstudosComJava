package ADS.Atividade7;

public class MainFunc {
    public static void main(String[] args) {
        Funcionario F1 = new Funcionario("Arthur", 1500);
        Tecnico T1 = new Tecnico("Camille", 1500, 176, 400);
        Administrativo A1 = new Administrativo("Cecilia", 700, 281, "manha");
        Administrativo A2 = new Administrativo("Ariel", 700, 281, "noturno", 120);
        Funcionario[] funcionarios = {F1, T1, A1, A2};
        for (Funcionario f : funcionarios) {
           f.exibeDados();
        }
    }
}
