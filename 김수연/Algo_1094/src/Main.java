import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int count = 1;

        while (x != 0) {

            int stick = 64;

            while (stick > x) {
                stick = stick / 2;
            }

            x = x - stick;

            if (x == 0)
                break;

            count++;
        }

        System.out.println(count);
    }
}