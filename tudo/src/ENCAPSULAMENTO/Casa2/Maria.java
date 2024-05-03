package ENCAPSULAMENTO.Casa2;

// Maria consegue ver todos os seus atributos

public class Maria {

    private String segredo = "Roubei um carro";
    String facoDentroDeCasa = "Ronca durante o sono";
    protected String familiaSabe = "Maria deve no banco";
    public String todoMundoSabe = "Vou no bar";

    void test(){
        System.out.println(this.segredo); // Private
        System.out.println(this.facoDentroDeCasa); // Package
        System.out.println(this.familiaSabe); // Protected
        System.out.println(this.todoMundoSabe); // Public
    }
}
