public class Loops {
    public static void main(String[] args){
        // Estrutura de Loop: While
        /* Utilizado com uma condicional que 'enquanto' ela for verdadeira ele se repete,
        * sua variável de contador é previamente definida e atribuída na maior parte dos casos  */
        int c = 100;
        while(c >= 10){
            System.out.println("Vou diminuir 10 de " + c);
            System.out.println("Esse número é " + c + " agora");
            System.out.println("   ");
            c -= 10;
        }
        // Estrutura de Loop: For
        /* Sua condicional e variável de contador já veem nos seus parametros,
        * o que influencia em um bloco de código mais organizado */
        for (int i = 0; i <= 10; i++) {
            System.out.println("blablabla");
        }

        // Estrutura de Loop: Do While
        /* Utilizado na produção de testes, ele só é executado uma vez para verificar uma condição,
        * geralmente antecede o uso do próprio while e é adequado por sua segurança e controle em sistemas
        * com grandes bases de dados e estruturas complexas */
        int num = 0;
        do {
            System.out.println("Número: " + num);
        }while (num < 2);
        // Estrutura de Verificação de casos: Switch
        /* Utilizado para a verificação de valores previamente definidos a fim de simplicar a verificação
        * de variáveis e fornecer uma resposta específica para cada caso */
        int dia = 48;
        switch (dia){
            case 1:
                System.out.println("Domingoou");
                break;
            case 2:
                System.out.println("Segundou slc");
                break;
            case 3:
                System.out.println("Terçou");
                break;
            case 4:
                System.out.println("Quintou");
                break;
            case 5:
                System.out.println("Sextou");
                break;
            default:
                System.out.println("Sei não");
        }
    }
}
