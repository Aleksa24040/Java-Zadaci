
public class broj_posjeta {
	public static void main(String[] args) {
		
		int[] posjete = {1200, 3400, 2800, 4100, 
				3900, 4500, 3200,4700, 5900, 4300};
		int maxPosjeta = posjete[0];
		for(int i = 0; i < posjete.length; i++) {
			if(posjete[i] > maxPosjeta) {
				maxPosjeta = posjete[i];
			}
		}
		
		System.out.println("Najveci broj posjeta je: " + maxPosjeta);
		}
		
	}

