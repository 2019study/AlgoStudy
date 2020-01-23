import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int B = input.nextInt();

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++)     //map 받아오는 부분
            for (int j = 0; j < M; j++)
                map[i][j] = input.nextInt();


    }
}
