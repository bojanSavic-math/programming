package programi;

public enum Opcija {

 /*   IZLAZ_IZ_PROGRAMA("izlaz"),
    PRIKAZ_ZAUZETE_MEMORIJE("mem"),
    PRIKAZ_CENE_IZVRSAVANJA("cena"),
    PRIKAZ_DOSTUPNIH_PROGRAMA("svi"),
    PRIKAZ_DOSTUPNIH_OPCIJA("pomoc");

    private final String op;

    private Opcija(String op) {
        this.op = op;
    }*/

    IZLAZ_IZ_PROGRAMA,
    PRIKAZ_ZAUZETE_MEMORIJE,
    PRIKAZ_CENE_IZVRSAVANJA,
    PRIKAZ_DOSTUPNIH_PROGRAMA,
    PRIKAZ_DOSTUPNIH_OPCIJA;

    public static Opcija stringUOpciju(String opcija) {
        switch (opcija) {
            case "izlaz": return IZLAZ_IZ_PROGRAMA;
            case "mem": return PRIKAZ_ZAUZETE_MEMORIJE;
            case "cena": return PRIKAZ_CENE_IZVRSAVANJA;
            case "svi": return PRIKAZ_DOSTUPNIH_PROGRAMA;
            case "pomoc": return PRIKAZ_DOSTUPNIH_OPCIJA;
            default:
                System.out.println("Izabrali ste opciju koja ne postoji");
                return IZLAZ_IZ_PROGRAMA;
        }
    }

}
