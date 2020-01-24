import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long min = input.nextLong();
        long max = input.nextLong();
        long count = max - min + 1;
        double ans = Math.floor(Math.sqrt(max)) - (min == 1 ?Math.floor(Math.sqrt(min))-1:Math.floor(Math.sqrt(min)));
        System.out.println((long) (count - ans));
    }
}
