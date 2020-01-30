import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = scan.nextInt();
            int sum = 0;

            int[] score = new int[n];
            for (int j = 0; j < n; j++) {
                int temp = scan.nextInt();
                score[j] = temp;
                sum += temp;
            }
            int average =  sum / n;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (score[j] > average)
                    count++;
            }

            System.out.println(String.format("%.3f", (double) count / (double) n * 100) + "%");
        }
    }
}