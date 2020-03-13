import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int five = input / 5;
        int three = (input - (five * 5)) / 3;

        while (input != five * 5 + three * 3) {
            if (five < 0 || three < 0)
                break;
            five--;
            three = (input - (five * 5)) / 3;
        }

        if (input == five * 5 + three * 3 && !(five < 0 || three < 0))
            System.out.println(five + three);
        else
            System.out.println(-1);
    }
}