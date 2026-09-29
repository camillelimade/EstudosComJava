package ADS.Atividade6;

import ADS.Atividade3.ContaCorrente;

public class seguroDeVida extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0;
    }
}
