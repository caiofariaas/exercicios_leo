package Exercicio01;

import java.util.ArrayList;

public class Calculo {

    public static double mediaComum(ArrayList<Double> notas){

        double total = 0;

        for (Double nota : notas) {
            total += nota;
        }

        return total / notas.size();
    }


    public static double mediaPonderada(ArrayList<Double> notas, ArrayList<Double> pesos){

        double valor1 = 0d, valor2 = 0d;

        for (int i = 0; i < notas.size(); i++) {
            valor1 += notas.get(i) * pesos.get(i);
        }

        for (Double peso : pesos) {
            valor2 += peso;
        }
        return valor1 / valor2;
    }
}
