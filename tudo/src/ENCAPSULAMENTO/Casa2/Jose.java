package ENCAPSULAMENTO.Casa2;

// José mora na mesma casa/package!
// logo ele tem acesso aos atributos do tipo 'Package, Protected, Public'

public class Jose {

    Maria maria = new Maria();

    void test(){
        System.out.println(maria.facoDentroDeCasa); // Package
        System.out.println(maria.familiaSabe); // Protected
        System.out.println(maria.todoMundoSabe); // Public
    }
}
