package Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSaida {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Double> notas = new ArrayList<Double>();
    static ArrayList<Double> pesos = new ArrayList<Double>();


    public static void entradaNota(){

        String valid;
        double nota = 0;

        while (true){

            // Validação de categoria de entrada

            try{
                System.out.print("Digite uma nota: ");
                nota = Double.parseDouble(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("\n------------------------------");
                System.out.println("--Entre com uma nota válida!--");
                System.out.println("------------------------------\n");

                continue;
            }

            // Validação de nota (0-10)

            if(!Validacao.validar(nota)){
                System.out.println("\n------------------------------");
                System.out.println("--Entre com uma nota válida!--");
                System.out.println("------------------------------\n");

                continue;
            }

            notas.add(nota);

            System.out.print("\nDeseja inserir mais notas?: (s/n)  ");
            valid = sc.nextLine();

            if(valid.equalsIgnoreCase("s")){
                continue;
            }

            // Escolha de cálculo

            else if (valid.equalsIgnoreCase("n")) {

                int option;

                try {
                    System.out.print("\nEscolha o tipo de cálculo que deseja:\n1 <- Média Ponderada!\n2 <- Média Aritmética\n: ");
                    option = Integer.parseInt(sc.nextLine());
                }
                catch (NumberFormatException e){
                    System.out.println("\n------------------------------");
                    System.out.println("--Entre com uma nota válida!--");
                    System.out.println("------------------------------\n");
                    continue;
                }

                if(option == 1){
                    entradaPeso();
                }
                else if (option == 2) {
                    System.out.println("\n==============================");
                    System.out.println("Média Aritmética: " +  Calculo.mediaComum(notas) + "\nResultado: " + Resultado.resultado(Calculo.mediaComum(notas)));
                    System.out.println("==============================");
                }
                else{
                    System.out.println("\n------------------------------");
                    System.out.println("--Opção válida!--");
                    System.out.println("Iremos reiniciar suas entradas, por favor, recomeçe!");
                    System.out.println("------------------------------\n");
                    notas.clear();
                    continue;
                }
            }

            // Exceção de Entrada

            else {
                System.out.println("\n------------------");
                System.out.println("Valor inválido!");
                System.out.println("Iremos reiniciar suas entradas, por favor, recomeçe!");
                System.out.println("------------------\n");
                notas.clear();
                continue;
            }
            break;
        }
    }

    public static void entradaPeso(){

        double peso;
        int loop = 0;

        System.out.println("\n--A seguir, entre com os pesos!--\n");

        while (loop != notas.size()){

            // Validação de categoria de entrada

            try{
                System.out.print("Digite o peso: ");
                peso = Double.parseDouble(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("\n------------------------------");
                System.out.println("--Entre com uma nota válida!--");
                System.out.println("------------------------------\n");
                continue;
            }

            // Validação do peso (0-10)

            if(!Validacao.validar(peso)){
                System.out.println("\n------------------------------");
                System.out.println("--Entre com um peso válido!--");
                System.out.println("------------------------------\n");
                continue;
            }

            pesos.add(peso);
            loop++;
        }

        // Retorno

        System.out.println("\n==============================");
        System.out.println("Média ponderada : " + Calculo.mediaPonderada(notas, pesos) + "\nResultado: " + Resultado.resultado(Calculo.mediaPonderada(notas, pesos)));
        System.out.println("==============================");
    }
}
