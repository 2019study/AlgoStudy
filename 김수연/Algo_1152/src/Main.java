import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        String[] output = input.split(" ");

        if (input.isEmpty())
            System.out.println(0);
        else {
            System.out.println(output.length);
        }
    }
}