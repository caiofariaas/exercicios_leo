package Exercicio03;

public class Calculo {
    public static void calcularParcelas(double salario, double qtdeEmprestada){
        double valorTotal = (qtdeEmprestada * 0.35) + qtdeEmprestada, valorParcela = (valorTotal) / 24;

        if (!Validacao.verificarValores(valorParcela, salario, qtdeEmprestada)) {
            System.out.println("Você não pode realizar o empréstimo!");
            return;
        }

        System.out.println("\n------------------------------");
        System.out.printf("Valor parcela: %.2f\n", valorParcela);
        System.out.printf("Valor total: %.2f", valorTotal);
        System.out.println("\n------------------------------\n");
    }
}
