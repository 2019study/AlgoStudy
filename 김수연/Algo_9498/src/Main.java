import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = scan.nextInt();

        if (answer >= 90)
            System.out.println("A");
        else if (answer >= 80)
            System.out.println("B");
        else if (answer >= 70)
            System.out.println("C");
        else if (answer >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
