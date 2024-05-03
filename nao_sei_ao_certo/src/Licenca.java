public class Licenca {
    String software;
    String departamento;
    static int licencasAtribuidas;

    public Licenca(String software, String departamento) {
        this.software = software;
        this.departamento = departamento;
        licencasAtribuidas ++;
    }

    public static int getLicencasAtribuidas() {
        return licencasAtribuidas;
    }
}
