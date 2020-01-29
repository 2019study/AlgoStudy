import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(a);
        answer.add(b);
        answer.add(c);

        Collections.sort(answer);

        System.out.println(answer.get(1));
    }
}
