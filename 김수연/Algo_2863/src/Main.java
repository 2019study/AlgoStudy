import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] table = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                table[i][j] = scan.nextInt();
        }

        ArrayList<Double> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            answer.add(calculate(table));
            rotate(table);
        }
        answer.add(calculate(table));

        System.out.println(answer.indexOf(Collections.max(answer)));
    }

    private static void rotate (int[][] arr) {
        int temp = -1;

        temp = arr[0][0];
        arr[0][0] = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = arr[0][1];
        arr[0][1] = temp;
    }

    private static double calculate(int[][] arr) {
        return (double) arr[0][0] / (double) arr[1][0] + (double) arr[0][1] / (double) arr[1][1];
    }
}