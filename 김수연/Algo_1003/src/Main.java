import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int zero;
    private static int one;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        int[][] answer = new int[41][2];
        answer[0][0] = 1;
        answer[0][1] = 0;
        for (int i = 1; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                answer[i][0] = answer[i - 1][1];
                answer[i][1] = answer[i - 1][0] + answer[i - 1][1];
            }
        }

        int[] a = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int n = scan.nextInt();
            a[i] = n;
        }

        for (int i = 0; i < testCase; i++)
            System.out.println(answer[a[i]][0] + " " + answer[a[i]][1]);
    }
}
