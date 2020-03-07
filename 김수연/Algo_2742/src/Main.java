import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        while (a != 0) {
            System.out.println(a);
            a--;
        }
    }
}