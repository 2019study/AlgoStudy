import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 11047번 동전 0 문제
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            arr.add(value);
        }

        N--;
        int count = 0;
        while (K != 0) {
            if (arr.get(N) > K)
                N--;
            else {
                while (K >= arr.get(N)) {
                    K = K - arr.get(N);
                    count = count + 1;
                }
            }
        }

        System.out.println(count);
    }
}
