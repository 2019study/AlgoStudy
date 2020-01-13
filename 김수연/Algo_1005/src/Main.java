import java.util.Scanner;

public class Main {
    private class nod {
        private int index;
        private int weight;
        private nod next;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] delayTime = new int[n];
            int[][] buildingRule = new int[k][2];

            for (int j = 0; j < n; j++) {
                int building = scan.nextInt();
                delayTime[j] = building;
            }

            for (int j = 0; j < k; j++) {
                int building = scan.nextInt();
                int building2 = scan.nextInt();
                buildingRule[i][0] = building;
                buildingRule[i][1] = building2;
            }

            int lastBuilding = scan.nextInt();

            // 쓸모없는 규칙 지우기.
            //
        }
    }
}
