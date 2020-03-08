import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();

        ArrayList<Boolean> answer = new ArrayList<>();

        answer.add(false);
        answer.add(false);

        for (int i = 2; i <= end; i++)
            answer.add(true);

        for (int i = 2; (i*i) <= end; i++) {
            if (answer.get(i)) {
                for (int j = i * 2; j <= end; j += i)
                    answer.set(j, false);
            }
        }

        for (int i = start; i <= end; i++) {
            if (answer.get(i))
                System.out.println(i);
        }
    }
}