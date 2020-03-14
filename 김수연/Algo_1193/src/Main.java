import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int total = 1;
        int count = 1;

        while (total < input) {
            count++;
            total += count;
        }

        int position = input - (total - count);
        int sum = count + 1;
        int x = 0;
        int y = 0;

        if (count % 2 == 1) {
            y = 1;
            x = sum - y;
            for (int i = 1; i < position; i++) {
                x--;
                y++;
            }
        } else {
            x = 1;
            y = sum - x;
            for (int i = 1; i < position; i++) {
                x++;
                y--;
            }
        }

        System.out.println(x + "/" + y);
    }
}