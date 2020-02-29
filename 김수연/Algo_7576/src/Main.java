import java.util.Scanner;

public class Main {
    private static int x;
    private static int y;
    private static int[][] list;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        list = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++)
                list[i][j] = scan.nextInt();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (list[i][j] == 1) {
                    dfs(i, j);
                }
            }
        }

        System.out.println();

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int i, int j) {
        list[i][j] = 1;

        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];

            if (ni >= 0 && nj >= 0 && ni < i && nj < j) {
                if (list[ni][nj] == 0)
                    dfs(ni, nj);
            }
        }
    }
}