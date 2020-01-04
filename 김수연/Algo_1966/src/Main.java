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
                    System.out.println("같은 경우");
                    System.out.println("before arr: " + arr);
                    System.out.println("before arr2: " + arr2);
                    System.out.println("M: " + M);
                    System.out.println("N: " + N);
                    System.out.println("count: " + count);
                    arr.remove(0);
                    arr2.remove(0);
                    System.out.println("after arr: " + arr);
                    System.out.println("after arr2: " + arr2);
                    M--;
                    N--;
                    if (M > arr.size() || M < 0)
                        M = arr.size() - 1;
                    count++;
                    System.out.println("M: " + M);
                    System.out.println("N: " + N);
                    System.out.println("count: " + count);
                } else {
                    System.out.println("다른 경우");
                    System.out.println("before arr: " + arr);
                    System.out.println("before arr2: " + arr2);
                    System.out.println("M: " + M);
                    System.out.println("N: " + N);
                    System.out.println("count: " + count);
                    arr.add(arr.remove(0));
                    System.out.println("after arr: " + arr);
                    System.out.println("after arr2: " + arr2);
                    M--;
                    if (M < 0)
                        M = arr.size() - 1;
                    System.out.println("M: " + M);
                    System.out.println("N: " + N);
                    System.out.println("count: " + count);
                }
                if (arr2.size() == 0)
                    arr2.add(0, -1);

                if (M == 0 && temp >= arr2.get(0)) {
                    M--;
                    N--;
                    count++;
                    System.out.println("M: " + M);
                    System.out.println("N: " + N);
                    System.out.println("count: " + count);
                    break;
                }
                System.out.println("M: " + M);
                System.out.println("N: " + N);
                System.out.println("count: " + count);
            }
            answer.add(count);
        }

        for (int i = 0; i < testCase; i++)
            System.out.println(answer.get(i));
    }
}
