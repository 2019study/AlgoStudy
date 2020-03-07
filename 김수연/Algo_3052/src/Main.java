import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int temp = scan.nextInt();
            if (!answer.contains(temp % 42))
                answer.add(temp % 42);
        }

        System.out.println(answer.size());
    }
}