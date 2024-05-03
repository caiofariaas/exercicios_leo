public class Chave {
    private String cor;
    private int numero;

    static String laboratorio = "DS1";

    public Chave(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
