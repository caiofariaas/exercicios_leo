package Exercicio01;

public class Validacao {

    public Boolean validar(double nota){
        return !(nota > 10) && !(nota < 0);
    }
}
