import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] kind = new int[N];
        int K = input.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++)
            kind[i] = input.nextInt();

        for (int i = N - 1; i >= 0; i--) {
            if(K / kind[i] > 0) {
                count += (K / kind[i]);
                K=K%kind[i];
            }
        }
        System.out.print(count);
    }
}
