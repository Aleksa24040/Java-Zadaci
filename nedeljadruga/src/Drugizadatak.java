import java.util.Scanner;

public class Drugizadatak {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			double cx = sc.nextDouble();
			double cy = sc.nextDouble();
			double r1 = sc.nextDouble();
			double r2 = sc.nextDouble();
			int N = sc.nextInt();
			
			
			double r1sq = r1 * r1;
			double r2sq = r2 * r2;
			int brojtrkacagore = 0;
			//najudaljenniji trkac
			double najvecadistanca = -1.0;
			double farx = 0.0,fary =0.0;
			for (int i = 0; i < N; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double dx = x - cx;
				double dy = y - cy;
				double d2 = dx * dx + dy * dy;
				if (d2 >= r1sq && d2 <= r2sq && y >= cy) {
					brojtrkacagore++;
				}
				if (d2 > najvecadistanca) {
					najvecadistanca = d2;
					farx = x;
					fary = y;
				}
			}
System.out.println(brojtrkacagore);
System.out.printf("%.6f %.6f %.6f%n",farx , fary,Math.sqrt(najvecadistanca));
		}
	
	}

}
