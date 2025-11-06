public class Racunari extends EProizvodi {
    private String procesor;
    private int memorija; 

    public Racunari(String sifra, String opis, double uvoznaCijena, String procesor, int memorija) {
        super(sifra, opis, uvoznaCijena);
        this.procesor = procesor;
        this.memorija = memorija;
    }

    @Override
    public double maloprodajnaCijena() {
        double cijena = uvoznaCijena * 1.05; 
        cijena *= 1.05; 
        return cijena;
    }

    @Override
    public String toString() {
        return super.toString() + ", Procesor: " + procesor + ", Memorija: " + memorija + "GB, Maloprodajna cijena: " + maloprodajnaCijena();
    }
}
