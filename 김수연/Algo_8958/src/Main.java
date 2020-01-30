import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String temp = scan.next();

            String[] answer = temp.split("X");

            int sum = 0;
            for (int j = 0; j < answer.length; j++)
                sum += sumAll(answer[j].length());

            System.out.println(sum);
        }
    }

    private static int sumAll(int n) {
        return n * (n + 1) / 2;
    }
}