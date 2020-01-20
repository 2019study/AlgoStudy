import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        int YSum = 0;
        int MSum = 0;

        for (int i = 0; i < testCase; i++) {
            int temp = scan.nextInt();
            YSum += (temp / 30) * 10 + 10;
            MSum += (temp / 60) * 15 + 15;
        }

        if (YSum > MSum)
            System.out.println("M " + MSum);
        else if (YSum < MSum)
            System.out.println("Y " + YSum);
        else
            System.out.println("Y M " +YSum);
    }
}