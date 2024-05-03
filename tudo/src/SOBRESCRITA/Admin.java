package SOBRESCRITA;

public class Admin extends Usuario{
    public Admin(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public void concederAcessos() {
        super.concederAcessos();
        System.out.printf("\nUsuario %s está com acessos administrativos!", this.getNome());
    }
}
