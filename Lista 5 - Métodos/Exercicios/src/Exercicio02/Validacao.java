package Exercicio02;

public class Validacao {
    public static boolean verificarSalario(double salario) {
        return !(salario < 500) && !(salario > 30000);
    }
}
