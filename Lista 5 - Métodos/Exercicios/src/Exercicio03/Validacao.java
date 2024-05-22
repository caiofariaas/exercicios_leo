package Exercicio03;

public class Validacao {
    public static boolean verificarValores(double valorParcela,double salario, double qtdeEmprestada){
        double porcentagemSalario = salario * 0.15;
        return !(valorParcela > porcentagemSalario) && !(qtdeEmprestada > 200000);
    }
}
