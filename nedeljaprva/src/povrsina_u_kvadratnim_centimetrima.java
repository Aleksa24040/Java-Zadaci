import java.util.Scanner;
public class povrsina_u_kvadratnim_centimetrima {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double P = a * b / 100;
			System.out.printf("P=%.2f",P);
		}
		
	}
}
