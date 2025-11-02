import java.util.Scanner;

public class GPSTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj GPS prijemnika: ");
        int n = sc.nextInt();
        sc.nextLine();
        GPSPrijemnik[] prijemnici = new GPSPrijemnik[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("\nUnos podataka za prijemnik " + (i + 1) + ":");
            System.out.print("Naziv: ");
            String naziv = sc.nextLine();
            System.out.print("Serijski broj: ");
            String serijski = sc.nextLine();
            System.out.print("Latitude: ");
            double lat = sc.nextDouble();
            System.out.print("Longitude: ");
            double lon = sc.nextDouble();
            System.out.print("Altitude: ");
            double alt = sc.nextDouble();
            sc.nextLine(); 

            prijemnici[i] = new GPSPrijemnik(naziv, serijski, lat, lon, alt);
        }

      
        System.out.print("\nUnesite serijski broj za pretragu: ");
        String trazeni = sc.nextLine();
        GPSPrijemnik nadjeni = GPSPrijemnik.pronadjiPoSerijskom(prijemnici, trazeni);

        if (nadjeni != null)
            System.out.println("Pronađen prijemnik: " + nadjeni);
        else
            System.out.println("Prijemnik sa datim serijskim brojem nije pronađen.");

        
        
        
        
        System.out.print("\nUnesite minimalnu nadmorsku visinu: ");
        double minAlt = sc.nextDouble();
        System.out.print("Unesite maksimalnu nadmorsku visinu: ");
        double maxAlt = sc.nextDouble();

        GPSPrijemnik[] izdvojeni = GPSPrijemnik.izdvojiPoVisini(prijemnici, minAlt, maxAlt);

        System.out.println("\nPrijemnici u zadatom opsegu visine (" + minAlt + " - " + maxAlt + "):");
        for (GPSPrijemnik gps : izdvojeni) {
            System.out.println(gps);
        }

       sc.close();
    }
}

