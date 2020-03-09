import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] dp = new int[n + 1];
        int[] list = new int[n + 1];

        for (int i = 1; i <= n; i++)
            list[i] = scan.nextInt();

        dp[1] = list[1];
        if (n >= 2)
            dp[2] = dp[1] + list[2];

        for (int i = 3; i <= n; i++)
            dp[i] = Math.max(dp[i - 2] + list[i], dp[i - 3] + list[i - 1] + list[i]);

        System.out.println(dp[n]);
    }
}