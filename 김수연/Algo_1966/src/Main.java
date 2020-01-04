import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1966번 프린터 큐 문제
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> arr2 = new ArrayList<Integer>();

            for (int j = 0; j < N; j++) {
                int temp = scan.nextInt();
                arr.add(temp);
                arr2.add(temp);
            }

            Collections.sort(arr2);
            Collections.reverse(arr2);

            int count = 0;
            int temp = arr.get(M);
            System.out.println("temp: " + temp);

            while (true) {
                if (arr.isEmpty())
                    break;

                if (arr.get(0).equals(arr2.get(0))) {
                    arr.remove(0);
                    arr2.remove(0);
                    M--;
                    N--;
                    if (M > arr.size() || M < 0)
                        M = arr.size() - 1;
                    count++;
                } else {
                    arr.add(arr.remove(0));
                    M--;
                    if (M < 0)
                        M = arr.size() - 1;
                }
                if (arr2.size() == 0)
                    arr2.add(0, -1);

                if (M == 0 && temp >= arr2.get(0)) {
                    M--;
                    N--;
                    count++;
                    break;
                }
            }
            answer.add(count);
        }

        for (int i = 0; i < testCase; i++)
            System.out.println(answer.get(i));
    }
}
