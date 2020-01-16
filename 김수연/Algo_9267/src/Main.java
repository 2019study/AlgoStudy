import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 9267번 A + B 문제
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        long s = scan.nextLong();

        // 0 처리
        if (a == 0 && b == 0) {
            if (s == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else if (a == 0) {
            if (s == 0 || s % b == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else if (b == 0) {
            if (s == 0 || s % a == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        // 연산이 필요없는 경우
        else if (a == s || b == s)
            System.out.println("YES");

        // 연산이 한번만 이루어지는 경우
        else if (a + b == s)
            System.out.println("YES");

        // 연산하기
        else if (a + b > s)
            System.out.println("NO");

        else {
            long max, min;
            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }

            s = s - (a + b);
            long quotient = s / max;
            long temp;
            while (quotient >= 0) {
                temp = (s - max * quotient) / min;
                if (s == max * quotient + min * temp) {
                    System.out.println("YES");
                    break;
                } else {
                    quotient--;
                    if (quotient == -1) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
    }
}