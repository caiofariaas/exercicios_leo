public class Main {
    public static void main(String[] args) {

        Licenca windows = new Licenca("Windows", "CaP/ETS");
        Licenca docker = new Licenca("Docker", "BD/XD");
        Licenca office = new Licenca("Office", "CaP/ETS");

        System.out.println(Licenca.getLicencasAtribuidas());
    }
}
