package Exercicio01;

public class Calculo {

    public double mediaComum(double num1, double num2){
        return (num1 + num2) / 2;
    }

    public double mediaPonderada(double num1, double num2, double peso1, double peso2){
        return (peso1 * num1 + peso2 * num2) / peso1 + peso2;
    }
}
