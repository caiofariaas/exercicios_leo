package ENCAPSULAMENTO.Casa1;

import ENCAPSULAMENTO.Casa2.Maria;

// Leticia não tem relação direta com maria, logo, só tem acesso aos atributos Publicos

public class Leticia {

    Maria maria = new Maria();

    void test(){
        System.out.println(maria.todoMundoSabe); // Public
    }
}
