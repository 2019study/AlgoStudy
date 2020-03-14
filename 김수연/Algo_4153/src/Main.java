import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while (!(a == 0 && b == 0 && c == 0)) {
            list.add(a);
            list.add(b);
            list.add(c);

            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        }
        int size = list.size() / 3;

        for (int i = 0; i < size; i++) {
            int[] answer = new int[3];
            answer[0] = list.remove(0);
            answer[1] = list.remove(0);
            answer[2] = list.remove(0);

            Arrays.sort(answer);

            if (answer[0] * answer[0] + answer[1] * answer[1] - answer[2] * answer[2] == 0)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}