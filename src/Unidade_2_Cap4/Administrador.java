package Unidade_2_Cap4;

public class Administrador implements Autenticavel {
    private String senha = "admin";
    private String code = "admin0103";

    public Administrador(String senha) {
        this.senha = senha;
    }
    public boolean autenticar(String senhaDigitada) {
        return senha.equals(senhaDigitada) && code.equals("admin0103");
    }

}
