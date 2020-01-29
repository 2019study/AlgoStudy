import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            answer.add(temp);
        }

        Collections.sort(answer);

        System.out.print(answer.get(0) + " " + answer.get(n - 1));
    }
}
