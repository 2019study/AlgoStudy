import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int count = 0;
        while (input > 0) {
            count++;
            String temp = Integer.toString(count);

            if (temp.contains("666"))
                input--;
        }

        System.out.println(count);
    }
}