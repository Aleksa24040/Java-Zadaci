import java.util.Scanner;
public class povrsina_kruga {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			double P = sc.nextDouble();
			double r = Math.sqrt(P / Math.PI);
			double O = 2 * r * Math.PI;
			System.out.printf("O = %.2f", O);
		}
		
	}

}
