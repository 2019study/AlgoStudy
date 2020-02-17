import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int count = 0;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};
    private static int[][] answer;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            String temp = scan.next();

            for (int j = 0; j < n; j++)
                answer[i][j] = temp.charAt(j) - '0';
        }

        int total = 0;
        PriorityQueue<Integer> number = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i][j] == 1) {
                    count = 0;
                    total++;
                    dfs(i, j);
                    number.add(count);
                }
            }
        }

        System.out.println(total);
        while (!number.isEmpty())
            System.out.println(number.poll());
    }

    private static void dfs(int x, int y) {
        answer[x][y] = 0;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && 0 <= ny && nx < n && ny < n) {
                if (answer[nx][ny] == 1)
                    dfs(nx, ny);
            }
        }
    }
}