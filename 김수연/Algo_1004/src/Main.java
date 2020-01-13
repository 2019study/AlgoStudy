import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        int[] answer = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int count = 0;
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                int cx = scan.nextInt();
                int cy = scan.nextInt();
                int cr = scan.nextInt();

                if ((Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) > cr * cr &&
                        Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < cr * cr) ||
                        (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < cr * cr &&
                                Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) > cr * cr))
                    count++;
            }
            answer[i] = count;
        }
        for (int i = 0; i < testCase; i++)
            System.out.println(answer[i]);
    }
}
