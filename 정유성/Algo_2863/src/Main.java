import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double D = input.nextDouble();
		double[] result = new double[4];
		result[0] = A / C + B / D;
		result[1] = C / D + A / B;
		result[2] = D / B + C / A;
		result[3] = B / A + D / C;
		int temp = 0;
		double base = result[0];
		for (int i = 1; i < 4; i++) {
			if(result[i]>base) {
				temp = i;
				base = result[i];
			}
		}
		System.out.println(temp);

	}

}
