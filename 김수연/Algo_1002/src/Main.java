import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1002번 터렛 문제
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int r1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int r2 = scan.nextInt();

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2)
                    answer[i] = -1;
                else
                    answer[i] = 0;
            }

            else {
                double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                int r3 = r1 + r2;
                int r0 = Math.abs(r2 - r1);

                if (distance < r0 || distance > r3)
                    answer[i] = 0;
                else if (distance == r3 || distance == r0)
                    answer[i] = 1;
                else
                    answer[i] = 2;
            }
        }

        for (int i = 0; i < N; i++)
            System.out.println(answer[i]);
    }
}
