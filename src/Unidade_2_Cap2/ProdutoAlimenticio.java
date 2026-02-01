package Unidade_2_Cap2;

import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {
    private LocalDate dataValidade;

    public ProdutoAlimenticio(String nome, String marca, LocalDate dataValidade) {
        super(nome, marca);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        if (dataValidade == null) {
            throw new IllegalArgumentException("Data de validade não pode ser nula,  insira uma data válida");
        }
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(dataValidade);
    }

    public boolean estaDentroDaValidade() {
        return !estaVencido();
    }

    public static void main(String[] args) {
        ProdutoAlimenticio p = new ProdutoAlimenticio(
                "Leite",
                "Italac",
                LocalDate.of(2007, 7, 16)
        );
        p.setDataValidade(LocalDate.of(2007, 7, 16));
        System.out.println("Essa é a data de validade: "+ p.getDataValidade());
        System.out.println("Está vencido? " + p.estaVencido());
        System.out.println("Está dentro da validade? " + p.estaDentroDaValidade());
        // LocalDate.of(ANO, MÊS, DIA)

    }
}
