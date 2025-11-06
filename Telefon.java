public class Telefon extends EProizvodi {
    private String operativniSistem;
    private double velicinaEkrana; 

    public Telefon(String sifra, String opis, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
        super(sifra, opis, uvoznaCijena);
        this.operativniSistem = operativniSistem;
        this.velicinaEkrana = velicinaEkrana;
    }
    @Override
    public double maloprodajnaCijena() {
        double cijena = uvoznaCijena * 1.05; 
        if (velicinaEkrana > 6) {
            cijena *= 1.03;
        }
        return cijena;
    }
    @Override
    public String toString() {
        return super.toString() + ", OS: " + operativniSistem + ", Ekran: " + velicinaEkrana + "\", Maloprodajna cijena: " + maloprodajnaCijena();
    }
}

