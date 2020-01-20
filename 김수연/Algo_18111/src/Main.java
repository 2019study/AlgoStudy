import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 18111번 마인크래프트 문제
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int b = scan.nextInt();

        int sum = 0;
        int[][] answer = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int height = scan.nextInt();
                answer[i][j] = height;
                sum += height;
            }
        }

        int average = sum / (n * m);
        int time = 0;

        int[][] temp = new int[n][m];
        int tempSum = sum;

        sum = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    temp[i][j] = average - answer[i][j];
                    sum += temp[i][j];
                    if (temp[i][j] < 0)
                        time += temp[i][j] * -2;
                    else
                        time += temp[i][j];
                }
            }
            System.out.println("average: " + average);
            System.out.println("sum: " + sum);
            System.out.println("time: " + time);

            if ((b < n * m) && ((b + tempSum) % (n * m)) == 0) {
                average = (b + tempSum) / (n * m);
                time = 0;
                sum = 0;
                tempSum = -b + 1;
            }
            else if (b < sum) {
                average++;
                time = 0;
                sum = 0;
            }
            else
                break;
        }
        System.out.println(time + " " + average);
    }
}
