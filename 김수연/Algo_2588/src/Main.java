import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = b % 10;
        int d = b % 100 / 10;
        int e = b / 100;

        System.out.println(a * c);
        System.out.println(a * d);
        System.out.println(a * e);
        System.out.println(a * b);
    }
}
