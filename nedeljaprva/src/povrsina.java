import java.util.Scanner;
public class povrsina {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double P = a * b, o = 2 * a + 2 * b;
			System.out.printf("P=%.2f O=%.2f%n", P, o);
		}
	}
	
}
