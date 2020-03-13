import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if (input < 111) {
            if (input > 99)
                System.out.println(99);
            else
                System.out.println(input);
        }
        else {
            int count = 99;
            int number = 111;
            while (number <= input) {
                if (number == 1000)
                    break;
                String temp = Integer.toString(number);

                int first = Integer.parseInt(temp.substring(0, 1));
                int second = Integer.parseInt(temp.substring(1, 2));
                int third = Integer.parseInt(temp.substring(2, 3));

                if (first - second == second - third)
                    count++;

                number++;
            }
            System.out.println(count);
        }
    }
}