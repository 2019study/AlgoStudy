import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int temp = 1;
        while (temp != line) {
            for (int i = 0; i < temp; i++)
                System.out.print("*");
            System.out.println();
            temp++;
        }
        while (temp != 0) {
            for (int i = 0; i < temp; i++)
                System.out.print("*");
            System.out.println();
            temp--;
        }
    }
}
