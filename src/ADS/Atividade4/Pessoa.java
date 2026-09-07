package ADS.Atividade4;

public class Pessoa {
    private String nomeCompleto;
    private String CPF;
    private String email;
    private String telefone;
    public Pessoa(String nomeCompleto, String CPF, String email, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
