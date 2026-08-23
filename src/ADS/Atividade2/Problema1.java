package ADS.Atividade2;

public class Problema1 {
    public static void main(String[] args) {
        float preco = 5; // preço inicial do ingresso
        int ingressos = 120; // quantidade inicial de ingressos
        int despesas = 200; // despesas
        while (preco >= 1.0){ // roda até o limite estabelecido pelo enunciado
            float lucro = (preco * ingressos) - despesas; // calculo do lucro
            System.out.println("Preço do ingresso: R$ " + preco); // exibe os preços atualizados a cada volta
            System.out.println("Quantidade de ingressos: " + ingressos);
            System.out.println("Lucro esperado: R$ " + lucro);
            System.out.println("-----------------");
            preco -= 0.50; //diminuindo o preço dos ingressos 50 centavos
            ingressos += 26; // estimativa de aumento de compras em 26
        }

    }
}
