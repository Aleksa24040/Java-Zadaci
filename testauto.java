class Auto {
	private String markaAuta;
	private int godisteAuta;
	private float snagamotora;
	private boolean prodato;
	private float kubikaza;
	private boolean registrovan;
	private static int BrojProdatih = 0;
	
	public Auto(String markaAuta, int godisteAuta, float snagamotora, boolean prodato,
				float kubikaza, boolean registrovan) {
		
		this.markaAuta = markaAuta;
		this.godisteAuta = godisteAuta;
		this.snagamotora = snagamotora;
		this.prodato = prodato;
		this.kubikaza = kubikaza;
		if(prodato) BrojProdatih++;
		this.registrovan = godisteAuta < 1985 ? false: registrovan;
		
		
		
		
	}

	public String getMarkaAuta() {
		return markaAuta;
	}

	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}

	public int getGodisteAuta() {
		return godisteAuta;
	}

	public void setGodisteAuta(int godisteAuta) {
		if(godisteAuta >= 2025)
			System.out.print("Jos nismo dosli do te godine");
		return;
	}
	

	public float getSnagamotora() {
		return snagamotora;
	}

	public void setSnagamotora(float snagamotora) {
		this.snagamotora = snagamotora;
	}

	public boolean isProdato() {
		return prodato;
	}

	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}

	public float getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(float kubikaza) {
		this.kubikaza = kubikaza;
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		if(this.godisteAuta >= 1985) this.registrovan = registrovan;
	}
	
	
	public static int BrojProdatih() {
		return BrojProdatih;
	}
	
	public boolean mozeseregistrovati() {
		return godisteAuta >= 1985;
		}
	
	public static double koeficijentzagodiste(int godiste) {
	if (godiste < 1985) return 0.0;
	if (godiste <= 2000 ) return 3.0;
	if (godiste <= 2010) return 2.0;
	return 1.5;
	}
	
	
	public double cijenaregistracije(){
		if (!mozeseregistrovati()) return 0.0;
		return koeficijentzagodiste(godisteAuta) * kubikaza * snagamotora;
	}
	public String toString() {
		return String.format("Auto [marka=%s,godiste=%d , snaga=%1f, "
				 + "kubikaza=%.1f, registrovan=%s, prodato = %s, cijenaregistracije=%2f] "
				, markaAuta, godisteAuta, snagamotora, kubikaza,
				registrovan ? "da" : "ne" , 
				prodato ? "da" : "ne", cijenaregistracije());
 	
	}
	}
	class AutoServis {
		
		public static Arraylist<Auto> neregistrovanikojisemogregistrovati(ArrayList<Auto>auta) {
			ArrayList<Auto> lista = new ArrayList<>();
			for(Auto a: auta) {
				if(a.mozeseregistrovati() && !a.isRegistrovan()) {
					lista.add(a);
				}
			}
			return lista;
	}
	public static double ukupnaregistracija(ArrayList<Auto> auta) {
		double suma = 0;
		for(Auto a:auta) {
			suma+= a.cijenaregistracije();
		}
		return suma;
	}
public class testauto{
	
	
	
	public static void main(String[] args) {
		ArrayList<Auto> auta = new ArrayList<>();
		Auto al = new Auto("VW golf 3", 1995, 55 , true, 1600, false);
		auta.add(al);
		auta.add(new Auto("BMW 320d", 2020, 140, true, 1995, false));
		for (Auto a: AutoServis.neregistrovanikojisemogregistrovati(auta)) {
			System.out.println(a);
		}
		System.out.print(auta.get(0));
		
		
		
	}
}