package SOBRESCRITA;

public class Usuario {
    private String nome, email, senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void autenticar(){
        System.out.printf("Usuario %s esta autenticado", this.nome);
    }

    public void concederAcessos(){
        System.out.printf("\nUsuário %s está com acessos regulares", this.nome);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
