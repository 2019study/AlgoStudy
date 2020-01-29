import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] answer = new int[9];

        for (int i = 0; i < 9; i++) {
            int temp = scan.nextInt();
            answer[i] = temp;
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            if (max < answer[i]) {
                max = answer[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}