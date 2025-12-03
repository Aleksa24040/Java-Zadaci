import java.util.Scanner;
public class zadatak2 {
	 
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				double cijena = 0;
				boolean validno = false;

				while (!validno) {
				    System.out.print("Unesite cijenu proizvoda: ");
				    String unos = scanner.nextLine();

				    try {
				        cijena = Double.parseDouble(unos); 
				        if (cijena <= 0) {
				            throw new IllegalArgumentException("Cijena mora biti veći pozitivan broj!");
				        }

				        validno = true; 

				    } catch (NumberFormatException e) {
				        System.out.println("Greška: morate unijeti broj!");
				    } catch (IllegalArgumentException e) {
				        System.out.println("Greška: " + e.getMessage());
				    }
				}

				System.out.println("Unijeli ste validnu cijenu: " + cijena);
			}
	    
	}
}
