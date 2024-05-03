package ENUMS;

public class Main {
    public static void main(String[] args) {

        Prioridade prioridade = Prioridade.valueOf("ALTA");

        switch (prioridade){
            case BAIXA -> System.out.println("Prioridade Baixa");
            case MEDIA -> System.out.println("Prioridade Média");
            case ALTA -> System.out.println("Prioridade Alta");
            case URGENTE -> System.out.println("Prioridade Urgente");
            default -> System.out.println("Prioridade não encontrada");
        }
    }
}
