import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        System.out.print("<");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K-1; j++)
                q.add(q.poll());
            if(i != N-1)
                System.out.print(q.poll() + ",  ");
            else
                System.out.print(q.poll() + ">");
        }
    }
}
