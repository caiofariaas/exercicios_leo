package Exercicio01;

public class Validacao {

    public static Boolean validar(double nota){
        return !(nota > 10) && !(nota < 0);
    }
}
