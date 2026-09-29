package ADS.Atividade6;


public class MainP4 {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Onibus(
                "WSK241",
                2008,
                40
        );
        veiculos[1] = new Onibus(
                "JDS942",
                2024,
                25
        );
        veiculos[2] = new Caminhao(
                "LOA223",
                2013,
                4
        );
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println("--------------------");
            veiculos[i].exibirDados();

        }
        for (Veiculo v: veiculos){
            System.out.println("--------------------");
            v.exibirDados();
        }
    }
}
