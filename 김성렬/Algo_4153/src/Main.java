
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a == 0 && b == 0 && c == 0)
                break;
            else {
                if(triangleTester(a,b,c))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }

    public static boolean triangleTester(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a)
            return true;
        else
            return false;
    }
}
