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
        // cria quarto
        Quarto q = new Quarto(10);
        System.out.println("---------------");
        System.out.println("Quarto");
        System.out.println("---------------");
        System.out.println("Valor da hospedagem: " + q.calcularValor(24));
        // cria suite
        Suite s = new Suite(123, "Quarto com varanda e banheira", 20, 2, 70);
        System.out.println("---------------");
        System.out.println("Suite");
        s.exibirInformacoes();
        System.out.println("---------------");
        System.out.println("Valor da hospedagem: " + s.calcularValor(10));
        System.out.println("Valor da hospedagem com desconto: " + s.calcularDesconto(10));
        // cria chale

        Chale ch1 = new Chale(1234, "Chale de verão",30, 10, 200, false);
        System.out.println("---------------");
        System.out.println("Chale sem cozinha");
        ch1.exibirInformacoes();
        System.out.println("---------------");
        System.out.println("Valor da Hospedagem: " + ch1.calcularValor(10));
        Chale ch2 = new Chale(1234, "Chale de verão",30, 10, 200, true);
        System.out.println("---------------");
        System.out.println("Chale com cozinha");
        ch2.exibirInformacoes();
        System.out.println("---------------");
        System.out.println("Valor da hospedagem: " + ch2.calcularValor(10));

    }
}
