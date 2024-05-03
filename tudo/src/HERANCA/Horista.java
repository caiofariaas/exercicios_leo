package HERANCA;

public class Horista  extends Colaborador{

    double horasTrabalhadas, salarioHora;

    public Horista(String nome, int edv, String cargo, double horasTrabalhadas, double salarioHora) {
        super(nome, edv, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public double getSalario(){
        return this.horasTrabalhadas * this.salarioHora;
    }

    @Override
    public String toString() {
        return "HERANCA.Horista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", salarioHora=" + salarioHora +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", edv=" + edv +
                '}';
    }
}
