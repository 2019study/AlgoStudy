import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String answer = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += Integer.parseInt(answer.substring(i, i+1));

        System.out.println(sum);
    }
}