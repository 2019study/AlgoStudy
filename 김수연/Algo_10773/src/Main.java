import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();

        Stack<Integer> answer = new Stack<Integer>();

        for (int i = 0; i < k; i++) {
            int temp = scan.nextInt();
            if (temp == 0)
                answer.pop();
            else
                answer.push(temp);
        }

        int sum = 0;
        while (!answer.isEmpty()) {
            sum += answer.pop();
        }
        System.out.println(sum);
    }
}