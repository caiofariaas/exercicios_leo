package GETTERSNSETTERS;

public class Usuario {
    private String nome;
    private String userID;
    private String senha;
    private int idade;

    public Usuario(String nome, String userID, String senha, int idade) {
        this.nome = nome;
        this.userID = userID;
        this.senha = senha;
        this.idade = idade;
    }
    public Usuario() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
