import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1931번 회의실배정 문제

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] list = new int[n][2];

        for (int i = 0; i < n; i++) {
            int sTime = scan.nextInt();
            int eTime = scan.nextInt();

            list[i][0] = sTime;
            list[i][1] = eTime;
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (list[i][1] > list[i + 1][0])
                list[i + 1][1] = list[i][1];
            else
                count++;
        }

        System.out.println(count);
    }
}
