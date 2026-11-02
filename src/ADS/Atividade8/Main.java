package ADS.Atividade8;

public class Main {
    public static void main(String[] args) {
        // veiculo caminhao
        Caminhao c = new Caminhao(
                "3211-brasil",
                "fusquinha rosa",
                123,
                40,
                8,
                10,
                3232.3,
                34124
                );
        c.obterLocalizacao();
        c.calcularCustoViagem();
        c.exibirDados();
        // veiculo moto
        Motocicleta m = new Motocicleta(
                "012-paraguai",
                "yamaha 3200",
                50,
                70,
                400,
                20
        );
        m.calcularCustoViagem();
        m.exibirDados();
        // veiculo eletrico
        VeiculoEletrico v = new VeiculoEletrico(
                "2303-china",
                "BYD",
                1200,
                4000,
                300,
                213,
                341,
                3213.4,
                2314.3
        );
        v.obterLocalizacao();
        v.calcularCustoViagem();
        v.exibirDados();
    }
}
