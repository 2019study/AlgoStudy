import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
            list.add(scan.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int a = list.get(i * 2);
            int b = list.get(i * 2 + 1);
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}