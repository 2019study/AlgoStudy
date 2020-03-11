import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] num = new int[n];
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
            str[i] = scan.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = 0; k < num[i]; k++)
                    System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
}