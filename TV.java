
public class TV extends EProizvodi {
	private double velicinaEkrana;

	public TV(String sifra, String opis, double uvoznaCijena, double velicinaEkrana) {
		super(sifra, opis, uvoznaCijena);
		this.velicinaEkrana = velicinaEkrana;
		}

	@Override
	public double maloprodajnaCijena() {
		double cijena = uvoznaCijena * 1.05;
		if(velicinaEkrana > 65) {
			cijena *= 1.10;
		}
		return cijena;
	}
	@Override
	public String toString() {
        return super.toString() + ", Ekran: " + velicinaEkrana + "\", Maloprodajna cijena: " + maloprodajnaCijena();
    }

}
