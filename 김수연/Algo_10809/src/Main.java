import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();

        for (int i = 0; i < 26; i++)
            System.out.print(temp.indexOf((char)(i + 97)) + " ");
    }
}