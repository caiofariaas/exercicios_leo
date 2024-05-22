package Exercicio02;

public class Calculo {

    static double  descINSS = 0, descIRPF = 0, descSaude = 0, acrescimo = 0, salario;

    public Calculo(double salario) {
        Calculo.salario = salario;
    }

    public static void calcINSS(){
        descINSS = 0.2 * salario;

        System.out.printf("O desconto de INSS será de: %.2f\n", descINSS);
    }

    public static void calcIRPF() {
        descIRPF = 0.1 * salario;

        System.out.printf("O desconto de IPRF será de: %.2f\n", descIRPF);
    }

    public static void calcPlanoSaude() {
        descSaude = 0.05 * salario;
        System.out.printf("O desconto do plano de saúde será de: %.2f\n", descSaude);
    }

    public static void acrescimoHoras(int horas, double salarioBruto){
        double horaNormal = salarioBruto / 160;
        acrescimo = horaNormal + (horaNormal * 0.5);

        System.out.printf("O acréscimo será de: %.2f\n", acrescimo);
    }

    public static void calcSalarioLiquido(){
        salario = salario - (descINSS + descIRPF + descSaude) + acrescimo;
        System.out.printf("O valor do salário líquido é de: %.2f\n", salario);
    }
}
