package Exercicio03;

import java.util.Scanner;

public class EntradaSaida {

    static double salario = 0, qtdeEmprestada = 0;

    static Scanner sc = new Scanner(System.in);
    public static void recebeDados(){
        System.out.println("Qual seu salário atual?");
        salario = Double.parseDouble(sc.nextLine());

        System.out.println("Quanto quer de empréstimo?");
        qtdeEmprestada = Double.parseDouble(sc.nextLine());

        Calculo.calcularParcelas(salario, qtdeEmprestada);
    }
}
