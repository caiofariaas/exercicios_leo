package SOBRESCRITA;

public class Main {
    public static void main(String[] args) {

        Admin usuario = new Admin("Caio", "caio@c.com", "123456");

        usuario.autenticar();
        usuario.concederAcessos();

    }
}
