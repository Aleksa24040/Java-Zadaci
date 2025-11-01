import java.util.Scanner;
public class prvizadatak {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();  //broj katapulta
			long D = sc.nextLong();  //Menhetn distanca
			long HD = sc.nextLong();  // broj healtha dvorca
			long KA = sc.nextLong();  //svaki katapult u dometu
			int threatcount = 0;
			for (int i = 0; i < N; i++) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				long manhattan = Math.abs(x) + Math.abs(y);
				if (manhattan <= D) {
					threatcount++;
				}
			}
			long totaldamage = (long) threatcount *KA;
			System.out.println(threatcount);
			if(totaldamage >= HD) {
				
			
				System.out.println("Dvorac je unisten");
			}
			else {
				System.out.println("Dvorac nije unisten");
			}
		}
			
	
	}
	
}
