import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        System.out.println(fi(input));
    }

    private static int fi(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fi(n-1) + fi(n - 2);
    }
}