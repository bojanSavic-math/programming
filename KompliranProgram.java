package programi;

public class KompliranProgram extends Program{

    private int brojInstrukcija;

    public KompliranProgram(String ime, double potrebnoMemorije, Platforma platforma, int brojInstrukcija) {
        super(ime, potrebnoMemorije, platforma);
        this.brojInstrukcija = brojInstrukcija;
    }

    public KompliranProgram(KompliranProgram kp) {
        this(kp.getIme(), kp.getPotrebnoMemorije(), kp.getPlatforma(), kp.brojInstrukcija);
    }

    public int getBrojInstrukcija() {
        return brojInstrukcija;
    }

    @Override
    double cenaIzvrsavanja() {
        return brojInstrukcija + this.getPlatforma().getBrojInstrukcijaZaUcitavanjeProcesa();
    }

    @Override
    double memorijskoZauzece() {
        return super.getPotrebnoMemorije() + this.getPlatforma().getMemorijaZaProces();
    }

    @Override
    public String toString() {
        return "[kompiliran program] " + super.getIme() + " " + super.getPotrebnoMemorije() + "MB " +
                "platforma = " + super.getPlatforma().getIme() + " brojInstrukcija = " + brojInstrukcija;
    }
}
