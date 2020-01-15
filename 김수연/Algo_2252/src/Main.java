import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 2252번 줄 세우기 문제
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        ArrayList<Integer>[] list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++)
            list[i] = new ArrayList<Integer>();
        int[] topology = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int value1 = scan.nextInt();
            int value2 = scan.nextInt();

            list[value1].add(value2);
            topology[value2]++;
        }

        Queue<Integer> answer = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (topology[i] == 0)
                answer.add(i);
        }

        while (!answer.isEmpty()) {
            int temp = answer.poll();
            System.out.print(temp + " ");

            for (int i = 0; i < list[temp].size(); i++) {
                int temp2 = list[temp].get(i);
                topology[temp2]--;
                if (topology[temp2] == 0)
                    answer.add(temp2);
            }
        }
    }
}
