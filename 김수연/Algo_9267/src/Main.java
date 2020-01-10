import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 9267번 A + B 문제
        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger s = scan.nextBigInteger();

        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;

        if ((a.add(b)).equals(s))
            System.out.println("YES");

        else if ((a.add(b)).compareTo(s) == 1 || (a.equals(zero) && b.equals(zero)))
            System.out.println("NO");

        else {
            if (a.equals(b)) {
                if (((s.divide(a)).multiply(a)).equals(s))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            BigInteger max, min;
            if (a.compareTo(b) == 1) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }

            BigInteger quotient = s.divide(max);
            while (!(quotient.compareTo(zero) == -1)) {
                BigInteger index = (s.subtract(max.multiply(quotient))).divide(min);
                if (s.equals((max.multiply(quotient)).add(min.multiply(index)))) {
                    System.out.println("YES");
                    break;
                }
                else
                    quotient = quotient.subtract(one);
            }
        }
    }
}