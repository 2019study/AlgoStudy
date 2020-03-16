import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int count = 1;
        int num = 1;

        while (input > num) {
            num = num + 6 * count;
            count++;
        }

        System.out.println(count);
    }
}