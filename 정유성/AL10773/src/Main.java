import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		Stack<Integer> dataSet = new Stack<>();

		for (int i = 0; i < K; i++) {
			int number = input.nextInt();
			if (number == 0)
				dataSet.pop();
			else
				dataSet.add(number);
		}
		int result = 0;
		while(!dataSet.isEmpty())
			result = result+dataSet.pop();
		System.out.println(result);
	}

}
