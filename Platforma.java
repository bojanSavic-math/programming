package programi;

public class Platforma {

    private String ime;
    private double brojInstrukcijaZaUcitavanjeProcesa;
    private double memorijaZaProces;

    public Platforma(String ime, double brInstr, double memorija) {
        this.ime = ime;
        brojInstrukcijaZaUcitavanjeProcesa = brInstr;
        memorijaZaProces = memorija;
    }

    public Platforma(Platforma p) {
        this(p.ime, p.brojInstrukcijaZaUcitavanjeProcesa, p.memorijaZaProces);
    }

    public String getIme() {
        return ime;
    }

    public double getBrojInstrukcijaZaUcitavanjeProcesa() {
        return brojInstrukcijaZaUcitavanjeProcesa;
    }

    public double getMemorijaZaProces() {
        return memorijaZaProces;
    }

    public void setBrojInstrukcijaZaUcitavanjeProcesa(double brojInstrukcijaZaUcitavanjeProcesa) {
        this.brojInstrukcijaZaUcitavanjeProcesa = brojInstrukcijaZaUcitavanjeProcesa;
    }

    @Override
    public String toString() {
         return "- " + ime + " broj instrukcija za ucitavanje procesa = " +
                brojInstrukcijaZaUcitavanjeProcesa + " memorija za proces = " + memorijaZaProces + "MB";
    }

}
