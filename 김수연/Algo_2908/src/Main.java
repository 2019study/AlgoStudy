import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        String temp = a.substring(2, 3) + a.substring(1, 2) + a.substring(0, 1);
        a = temp;
        temp = b.substring(2, 3) + b.substring(1, 2) + b.substring(0, 1);
        b = temp;

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);

        if (aa > bb)
            System.out.println(aa);
        else
            System.out.println(bb);
    }
}