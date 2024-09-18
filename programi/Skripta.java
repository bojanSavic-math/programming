package programi;

public class Skripta extends Program{

    private SkriptJezik jezik;
    private double cenaInstrukcije;
    private int brojLinija;

    public Skripta(String ime, double potrebnoMemorije, Platforma platforma, SkriptJezik jezik, double cenaInstrukcije, int brojLinija) {
        super(ime, potrebnoMemorije, platforma);
        this.jezik = jezik;
        this.cenaInstrukcije = cenaInstrukcije;
        this.brojLinija = brojLinija;
    }

    public Skripta(Skripta s){
        this(s.getIme(), s.getPotrebnoMemorije(), s.getPlatforma(), s.jezik, s.cenaInstrukcije, s.brojLinija);
    }

    public int getBrojLinija() {
        return brojLinija;
    }

    public void setBrojLinija(int brojLinija) {
        this.brojLinija = brojLinija;
    }

    @Override
    double cenaIzvrsavanja() {
        return super.getPlatforma().getBrojInstrukcijaZaUcitavanjeProcesa() + brojLinija*cenaInstrukcije;
    }

    @Override
    double memorijskoZauzece() {
        return super.getPotrebnoMemorije();
    }

    @Override
    public String toString() {
        return "[skripta] " + super.getIme() + "." + SkriptJezik.ekstenzijaJezika(jezik) + " " + super.getPotrebnoMemorije() + "MB platforma = " +
        super.getPlatforma().getIme() + " broj linija = " + brojLinija + " cena instrukcija = " + cenaInstrukcije;
    }
}
