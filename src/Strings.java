public class Strings {
    public static void main (String[] args){
        // String é uma classe utilizada oara representar texto, são objetos
        // imutáveis, ou seja, cada alteração gera um novo objeto.
        // Sua declaração pode ser feita de duas maneiras:
        String nome = "Camille";
        String sobreNome = new String ("Lima");
        // Ação de concatenar Strings:
        String frasePronta = nome + " " + sobreNome +  ", seja bem vindo(a)!";
        System.out.println(frasePronta);
        // Podemos verificar a quanidade de caracteres que existem em uma String dessa forma:
        System.out.println(frasePronta.length()); // Saída 32

        // Aqui acessamos o caractere desejado por meio da ordem em que ele se encontra na String:
        String banana = "banana";;
        char letra = banana.charAt(0); // Saída b

        // Há também a propriedade que possibilita a conversão de minuscula para maiuscula
        String linguagem = "Java";
        System.out.println(linguagem.toUpperCase());
        System.out.println(linguagem.toLowerCase());
    }
}
