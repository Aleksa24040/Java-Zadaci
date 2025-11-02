
public class GPSPrijemnik {

	private String nazivPrijemnika;
	private String serijskiBroj;
	private double latitude;
	private double longitude;
	private double altitude;
	
	public GPSPrijemnik(String nazivPrijemnika, String serijskiBroj, double latitude, double longitude, double altitude) {
		this.nazivPrijemnika = nazivPrijemnika;
		this.serijskiBroj = serijskiBroj;
		this.latitude = latitude;
		this.altitude = altitude;
		this.longitude = longitude;
		
	}

	public String getnazivPrijemnika() {
		return nazivPrijemnika;
	}
	public String getserijskiBroj() {
		return serijskiBroj;
	}
	public double getlatitude() {
		return latitude;
	}
	public double getlongitude() {
		return longitude;
	}
	public double getaltitude() {
		return altitude;
	}
	
	public void setnazivPrijemnika(String nazivPrijemnika) {
		this.nazivPrijemnika = nazivPrijemnika;
	}
	public void setserijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}
	public void setlatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setlongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setaltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public static GPSPrijemnik pronadjiPoSerijskom(GPSPrijemnik[] niz, String trazeniSerijski) {
		for (GPSPrijemnik gps : niz) {
			if (gps.getserijskiBroj().equalsIgnoreCase(trazeniSerijski)) {
				return gps;
			}
		}
		return null;
	}
	
	public static GPSPrijemnik[] izdvojiPoVisini(GPSPrijemnik[] niz, double minALt, double maxAlt) {
		int brojac = 0;
		for (GPSPrijemnik gps : niz) {
			if(gps.getaltitude() >= minALt && gps.getaltitude() <= maxAlt) {
				brojac++;
			}
		}
		GPSPrijemnik[] rezultat = new GPSPrijemnik[brojac];
		int i = 0;
		for (GPSPrijemnik gps : niz) {
			if(gps.getaltitude() >= minALt && gps.getaltitude() <= maxAlt) {
				rezultat[i++] = gps;
			}
		}
		return rezultat;
	}
	 @Override
	    public String toString() {
	        return "GPSPrijemnik{" +
	                "naziv='" + nazivPrijemnika + '\'' +
	                ", serijski='" + serijskiBroj + '\'' +
	                ", lat=" + latitude +
	                ", lon=" + longitude +
	                ", alt=" + altitude +
	                '}';
	 }
}


