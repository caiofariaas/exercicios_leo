package Exercicio02;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner sc = new Scanner(System.in);

    public static void recebeSalario(){
        double salario;
        int horas;

        while(true){
            System.out.println("Informe seu salário bruto: ");
            salario = Double.parseDouble(sc.nextLine());

            if (!Validacao.verificarSalario(salario)) {
                System.out.println("O salário deve ser entre 500 e 30.000!");
                continue;
            }

            System.out.println("Quantas horas extras você fez?");
            horas = Integer.parseInt(sc.nextLine());

            Calculo.calcINSS();
            Calculo.calcIRPF();
            Calculo.calcPlanoSaude();
            Calculo.acrescimoHoras(horas, salario);
            Calculo.calcSalarioLiquido();

            return;
        }
    }
}
