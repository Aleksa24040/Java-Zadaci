
public class Televizor {
	private int brojkanala;
	private String nazivKanala;
	private int jacinaTona;
	public Televizor(int brojkanala, String nazivKanala, int jacinaTona) {
		if (brojkanala >= 1) this.brojkanala = brojkanala;
		else this.brojkanala = 1;
		this.nazivKanala = nazivKanala;
		if (jacinaTona >= 0 && jacinaTona <= 10) {this.jacinaTona = jacinaTona;}
		else this.jacinaTona = 5;
		
	}
	public int getBrojkanala() {
		return brojkanala;
	}
	public void setBrojkanala(int brojkanala) {
		if (brojkanala >= 1)this.brojkanala= brojkanala;
		else System.out.println("Broj kanala mora biti veci od 1 ili jednak");
	}
	public String getNazivKanala() {
		return nazivKanala;
	}
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	public int getJacinaTona() {
		return jacinaTona;
	}
	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 1 && jacinaTona <= 10) {this.jacinaTona = jacinaTona;}
		else {
			System.out.println("Jacina tona mora biti izmedju 0 i 10");
		}	
	}
}
		