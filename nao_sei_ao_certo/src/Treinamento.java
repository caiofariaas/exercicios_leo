public class Treinamento {
    private String nome;
    private double preco;
    private boolean exclusivoGestores;

    private Instrutor instrutor;

    public Treinamento(String nome, double preco, boolean exclusivoGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoGestores = exclusivoGestores;
        this.instrutor = instrutor;
    }

    public Treinamento() {

    }

    public boolean isExclusivoGestores() {
        return exclusivoGestores;
    }

    public void setExclusivoGestores(boolean exclusivoGestores) {
        this.exclusivoGestores = exclusivoGestores;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
    return String.format("nome = %s\npreço = %.2f\nele %s exclusivo para gestores, " +
            "com o instrutor %s", this.nome, this.preco, this.exclusivoGestores ? "é":"não é", this.instrutor);
    }

    public int qtdMatriculas(){
        int matriculas =15;

        return matriculas;
    }
}

