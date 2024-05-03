public class Colaborador {
    private int edv;
    private String nome;
    private String cargo;


    public Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
    }

    public Colaborador() {
    }

    public Colaborador(String nome) {
        this.nome = nome;
    }

    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getEdv() {
        return edv;
    }

    public void setEdv(int edv) {
        this.edv = edv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String toString() {
        return String.format("Colaborador %s com edv %d tem o cargo de %s", this.nome, this.edv, this.cargo);
    }
}
