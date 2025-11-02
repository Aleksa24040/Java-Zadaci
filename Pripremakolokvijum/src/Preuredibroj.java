import java.util.Scanner;
public class Preuredibroj {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Unesi prvi broj: ");
			int a = sc.nextInt();
			System.out.print("Unesi drug broj: ");
			int b = sc.nextInt();
			System.out.print("Unesi treci broj: ");
			int c = sc.nextInt();
			
			int prvi = 0,drugi = 0,treci = 0;
			
			
			if(a <= b && a <= c) {
				prvi = a;
				if(b >= c) {
					drugi = b;
					treci = c;
				} else {
					drugi = c;
					treci = b;	
				}
			}else if (b <= a && b <= c) {
				prvi = b;
				if(a >= c) {
					drugi = a;
					treci = c;
				}else {
					drugi = c;
					treci = a;
				}
			}else if (c <= a && c <= b) {
				prvi = c;
				if(a >= b) {
					drugi = a;
					treci = b;
				}else {
					drugi = b;
					treci = a;
				}
			}
			System.out.println("Preuredjeni brojevi: " + prvi + ", " + drugi + ", " + treci);
		}
	}

}
