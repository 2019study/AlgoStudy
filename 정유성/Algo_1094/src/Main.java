import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int count = 1; //do while이였다면 count 가 0.
		int min = 64;
		int sum = 64;

		while (sum > x) {
			min = min / 2;
			if (sum - min < x) {
				count++; //keep하는 상황. keep을 한다는 것은 그것을 사용하겠다는 뜻
			} else {
				sum = sum - min;
			}
		}

		System.out.print(count);

	}

}
