import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long min = input.nextLong();
        long max = input.nextLong();
        long count = max - min + 1;
        double ans = 0;
        if(min == 1){
            ans = Math.floor(Math.sqrt(max));
        }else {
            ans = Math.floor(Math.sqrt(max)) - Math.floor(Math.sqrt(min));
        }

        System.out.println((long) (count - ans));
    }
}
