import java.util.*;

public class Main {
    private static Queue<Integer> answer;
    private static int count = 1;
    private static int temp;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        temp = scan.nextInt();

        answer = new LinkedList<>();
        answer.offer(temp);

        while (answer.size() != 0) {
            if (temp == 1) {
                count = 0;
                break;
            }
            calculate();
            if (answer.peek() == 1)
                break;
        }

        System.out.println(count);
    }

    private static void calculate() {
        if (answer.size() == 0)
            return;

        int peek = answer.peek();

        if (peek == -1) {
            answer.poll();
            return;
        }

        if (peek % 3 == 0)
            answer.offer(peek / 3);
        else
            answer.offer(-1);

        if (peek % 2 == 0)
            answer.offer(peek / 2);
        else
            answer.offer(-1);

        if (peek > 1)
            answer.offer(peek - 1);
        else
            answer.offer(-1);

        answer.poll();
        if (temp - peek == 1) {
            temp--;
            count++;
        }
    }
}