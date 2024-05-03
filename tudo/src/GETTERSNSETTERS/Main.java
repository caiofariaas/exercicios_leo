package GETTERSNSETTERS;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "JJ3CA", "123467", 18);

        usuario.setNome("Anderson");

        System.out.println(usuario.getNome());
    }
}
