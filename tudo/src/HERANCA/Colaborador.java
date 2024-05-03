package HERANCA;

public class Colaborador {
    String nome, cargo;
    int edv;


    public Colaborador(String nome, int edv, String cargo) {
        this.nome = nome;
        this.edv = edv;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "HERANCA.Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", edv=" + edv +
                '}';
    }
}
