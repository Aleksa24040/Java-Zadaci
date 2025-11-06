import java.util.ArrayList;
public class Test {

	public static ArrayList<EProizvodi> filtrirajProizvode(ArrayList<EProizvodi> proizvodi, String tip){
		ArrayList<EProizvodi> rezultat = new ArrayList<>();
	
		
	}
	
	
	public static void main(String[] args) {
		 ArrayList<EProizvodi> proizvodi = new ArrayList<>();

	        proizvodi.add(new Racunari("RA123", "Gaming PC", 1000, "Intel i7", 16));
	        proizvodi.add(new Telefon("TE555", "Samsung Galaxy", 500, "Android", 6.5));
	        proizvodi.add(new TV("TV999", "LG OLED", 800, 70));
	        proizvodi.add(new Telefon("TE333", "iPhone", 900, "iOS", 5.8));

	        System.out.println("=== Svi proizvodi ===");
	        for (EProizvodi p : proizvodi) {
	            System.out.println(p);
	        }

	     
	}

}
