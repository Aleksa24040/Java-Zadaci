
public class niz_brojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] niz = new int[10];
		//popunjavanje niza brojevima do 10
		for(int i = 0; i < niz.length; i++) {
			niz[i] = i + 1;
		}
		//ispis niza
		System.out.println("originalni niz: ");
		for (int broj : niz) {
			System.out.print(broj + " ");
		}
		
		//Ispis obrnutog redosljeda
		
		System.out.println("\n\nniz u obrnutom redsoljedu: ");
		for(int i = niz.length - 1; i >= 0;i--) {
			System.out.print(niz[i] + " ");
		}
	}

}
