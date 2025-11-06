public abstract class EProizvodi {
    protected String sifra;
    protected String opis;
    protected double uvoznaCijena;

    public EProizvodi(String sifra, String opis, double uvoznaCijena) {
        this.sifra = sifra;
        this.opis = opis;
        this.uvoznaCijena = uvoznaCijena;
    }
    
    
    public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public String getSifra() {
        return sifra;
    }
    public String getOpis() {
        return opis;
    }
    public double getUvoznaCijena() {
        return uvoznaCijena;
    }
    public abstract double maloprodajnaCijena();

    @Override
    public String toString() {
        return "Šifra: " + sifra + ", Opis: " + opis + ", Uvozna cijena: " + uvoznaCijena;
    }
}



