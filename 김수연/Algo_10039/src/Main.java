import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = scan.nextInt();
            if (temp < 40)
                temp = 40;
            sum += temp;
        }

        System.out.println(sum / 5);
    }
}