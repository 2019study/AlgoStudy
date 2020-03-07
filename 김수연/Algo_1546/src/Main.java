import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> answer = new ArrayList<>();

        int n = scan.nextInt();
        for (int i = 0; i < n; i++)
            answer.add(scan.nextInt());

        int max = Collections.max(answer);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            double temp2 = (double) answer.get(i) / max * 100;
            sum += temp2;
        }

        System.out.println(sum / n);
    }
}