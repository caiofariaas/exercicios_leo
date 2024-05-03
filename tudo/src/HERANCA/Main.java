package HERANCA;

public class Main {
    public static void main(String[] args) {

        Mensalista mensalista = new Mensalista("Caio Farias", 2323232, "Aprendiz DS", 4000);
        Horista horista = new Horista("Leonardo", 23232323, "Instrutor", 240, 10);

        System.out.printf("Salario do HERANCA.Mensalista: %s é de %.2f\n", mensalista.nome, mensalista.getSalario());
        System.out.printf("Salario do HERANCA.Horista: %s é de %.2f\n", horista.nome, horista.getSalario());
    }
}