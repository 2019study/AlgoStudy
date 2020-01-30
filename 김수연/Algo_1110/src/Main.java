import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int originalNum = n;

        int newNum = -1;
        int count = 0;

        while (originalNum != newNum) {
            int temp = n / 10 + n % 10;
            newNum = temp % 10 + n % 10 * 10;
            n = newNum; count++;
        }

        System.out.println(count);
    }
}