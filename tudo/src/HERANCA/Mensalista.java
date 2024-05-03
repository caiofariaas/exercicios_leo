package HERANCA;

public class Mensalista extends Colaborador{

    double bancoDeHoras, salarioMensal;

    public Mensalista(String nome, int edv, String cargo, double salarioMensal) {
        super(nome, edv, cargo);
        this.salarioMensal = salarioMensal;
    }

    public double getSalario(){
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return "HERANCA.Mensalista{" +
                "bancoDeHoras=" + bancoDeHoras +
                ", salarioMensal=" + salarioMensal +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", edv=" + edv +
                '}';
    }
}
