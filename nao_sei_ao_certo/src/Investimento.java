import java.math.BigDecimal;

public class Investimento {
    private String nomeInvestidor;
    private double saldoAtual;
    static double taxaRentabilidade = 0.02;

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public static double getTaxaRentabilidade() {
        return taxaRentabilidade;
    }

    public static void setTaxaRentabilidade(double taxaRentabilidade) {
        Investimento.taxaRentabilidade = taxaRentabilidade;
    }

    public Investimento(String nomeInvestidor, double saldoAtual) {
        this.nomeInvestidor = nomeInvestidor;
        this.saldoAtual = saldoAtual;
    }

    public void rentabilizar(){
        this.saldoAtual = this.saldoAtual * (1+ this.taxaRentabilidade);
    }
}
