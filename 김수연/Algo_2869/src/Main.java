import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int v = scan.nextInt();

        int temp1 = v - a;
        int temp2 = a - b;
        int temp3 = temp1 / temp2;

        if (temp1 % temp2 != 0)
            temp3 += 1;
        System.out.println(temp3 + 1);
    }
}