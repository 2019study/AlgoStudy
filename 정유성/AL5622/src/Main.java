import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//while (true) {
			String s = input.next();
			int[] sample = new int[s.length()];
			int result = 0;

			for (int i = 0; i < s.length(); i++) {
				sample[i] = (int) s.charAt(i) - 65;

				//System.out.print(s.charAt(i)+" ");

				if (sample[i] / 3 + 2 > 7) {
					int temp = sample[i] / 3 + 2;
					if (sample[i] == 18) {
						//System.out.println("7");
						result = result + 8;
					} else if (sample[i] < 22) {
						//System.out.println(8);
						result = result + 9;
					} else {
						//System.out.println(9);
						result = result + 10;
					}
				} else {
					//System.out.println(sample[i]/3+2);
					result = result + sample[i] / 3 + 2 + 1;
				}

			}
			System.out.println(result);
		//}
	}

}
