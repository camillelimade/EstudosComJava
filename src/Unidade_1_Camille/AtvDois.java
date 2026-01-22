package Unidade_1_Camille;

public class AtvDois {
    public static void main(String[] args) {
        // 2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
        //com seus valores atribuídos.

        // Resolvi reunir alguns dados do IBGE, peguei direto do site, então inseri a cada tipo
        // Link do Site: https://www.ibge.gov.br/cidades-e-estados/ce/fortaleza.html
        byte diaFundacao = 13; // Fortaleza foi fundada no dia 13 de Abril de 1726
        int anoFundacao = 1726; // Fortaleza foi fundada no ano de 1726
        short quantBairros = 184; // Fortaleza tem no total 19 municipios
        long bipPercapita = 3579674; // PIB Percapita em Fortal
        float mortalidadeInfantil = 11.78F; // Indice de Mortalidade infantil por mil nascidos vivos
        double densidadeDemo = 7.77552; // Densidade demográfica de fortaleza
        boolean cidadeLitoranea = true;
        char pontoCardeal = 'L'; // Pesquisei sobre e fortal partindo do centro de mapas padrões fica a leste, assim como a maioria das cidades litorais
        System.out.println("Reuni algumas informações acerca de Fortaleza - Ceará :)");
        System.out.println("Fortaleza foi fundada no dia " + diaFundacao + " de Abril");
        System.out.println("Fortaleza tem como ano de Fundação: " +  anoFundacao + " completando atualmente 400 anos");
        System.out.println("Fortaleza segundo o IBGE possui "+ quantBairros + " Bairros atualmente");
        System.out.println("O PIB Percapita em Fortaleza é de " +  bipPercapita);
        System.out.println("O Indice de Mortalidade infantil por mil nascidos vivos é: " + mortalidadeInfantil);
        System.out.println("A densidade demográfica de fortaleza é: " + densidadeDemo);
        System.out.println("É verdade que Fortaleza é uma cidade litoranea? --> " +  cidadeLitoranea);
        System.out.println("Partindo do centro de mapas convencionais fortaleza pode ser localizada seguindo o ponto cardeal Leste(" + pontoCardeal + ")");
    }
}
