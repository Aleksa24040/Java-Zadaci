import java.util.Scanner;
public class elemnti_niza {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			//Unos duzine niza
			System.out.print("Unes broj studenata(Duzina niza): ");
			int n = sc.nextInt();
			
			int[] bodovi = new int[n];
			for(int i = 0;i < n;i++) {
				System.out.print("Unesi broj bodova za studenta " + (i + 1) + ":  ");
				bodovi[i] = sc.nextInt();
				
				double suma = 0;
				for (int b: bodovi) {
					suma += b;
				}
				double prosjek = suma / n;
				int minvrijednost = bodovi[0];
				int minindeks = 0;
				for(int i1 = 1; i1 < n;i1++) {
					if (bodovi[i1] < minvrijednost) {
						minvrijednost = bodovi[i1];
						minindeks = i1;
					}
				}
				System.out.println("\nProsjecan broj bodova: " + prosjek);
				System.out.println("Najmanji broj bodova je: " + minvrijednost);
				System.out.println("Indeks najmanjeg elementa je: " + minindeks);
			}
		}
	}

}
