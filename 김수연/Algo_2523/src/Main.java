import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        for (int i = input; i > 0; i--) {
            for (int j = i; j <= input; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < input - 1; i++) {
            for (int j = i; j < input - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}