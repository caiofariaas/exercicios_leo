package ENCAPSULAMENTO.Casa1;

import ENCAPSULAMENTO.Casa2.Maria;

// Joao herda de maria, logo ele tem acesso a atributos do tipo Protected e Public

public class Joao extends Maria {

    Maria maria = new Maria();

    void test(){
        System.out.println(super.familiaSabe); // Protected
        System.out.println(super.todoMundoSabe); // Public
    }
}
