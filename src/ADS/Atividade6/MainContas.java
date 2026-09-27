package ADS.Atividade6;

public class MainContas {
    public static void main(String[] args) {
        contaCorrente corrente = new contaCorrente(100);
        contaPoupanca poupanca = new contaPoupanca(100);
        seguroDeVida seguro = new seguroDeVida(100);

        corrente.deposita(20);
        poupanca.deposita(20);
        seguro.deposita(20);

        System.out.println("----------------------------------------------");
        System.out.println("Conta corrente: ");
        System.out.println("Saldo: " + corrente.getSaldo());
        System.out.println("Tributo: " + corrente.calculaTributos());
        System.out.println("----------------------------------------------");
        System.out.println("Conta poupança: ");
        System.out.println("Saldo: " + poupanca.getSaldo());
        System.out.println("Tributo: " + poupanca.calculaTributos());
        System.out.println("----------------------------------------------");
        System.out.println("Seguro de Vida: ");
        System.out.println("Saldo: " + seguro.getSaldo());
        System.out.println("Tributo: " + seguro.calculaTributos());
        System.out.println("----------------------------------------------");
    }
}
