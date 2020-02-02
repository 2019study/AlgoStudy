import java.util.Scanner;

public class Main {
	public static int young(int[] array) {
		int fee = 0;
		for (int i = 0; i < array.length; i++) {
			fee = fee + (array[i] / 30 + 1) * 10;
		}
		return fee;
	}

	public static int min(int[] array) {
		int fee = 0;
		for (int i = 0; i < array.length; i++) {
			fee = fee + (array[i] / 60 + 1) * 15;
		}
		return fee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] time = new int[N];

		for (int count = 0; count < N; count++)
			time[count] = input.nextInt();
		int y =young(time);
		int m = min(time);
		if (y > m) {
			System.out.println("M "+m);
		} else if (y < m) {
			System.out.println("Y "+y);
		} else {
			System.out.println("Y M " +y);
		}

	}

}
