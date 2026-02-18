package Unidade_2_Cap4;

public class Usuario implements Autenticavel {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public String getLogin() {
        return login;
    }
    public boolean autenticar(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}