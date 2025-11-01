import java.util.Scanner;
public class Povrsina_na_kordinate {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			double xD = sc.nextDouble();
			double xL = sc.nextDouble();
			double yD = sc.nextDouble();
			double yL = sc.nextDouble();
			double a = xD - xL;
			double b = yL - yD;
			double P = a * b;
			System.out.printf("P = %.2f", P);
		}
		
		
		
	}

}
