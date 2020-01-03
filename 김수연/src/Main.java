import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1주차 백준 문제

        // 1158번 조세퍼스 문제
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n + 1];
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        arr[0] = -1;
        for (int i = 1; i < n + 1; i++)
            arr[i] = i;


        arr2.add(arr[k]);
        arr[k] = -1;

        int pointer = k;
        int count = k;
        for (int i = 0; i < n - 1; i++) {
            while (count != 0) {
                pointer++;
                if (pointer > n)
                    pointer = pointer % n;
                if (arr[pointer] == -1)
                    count++;
                count--;
            }
            arr2.add(arr[pointer]);
            arr[pointer] = -1;
            count = k;
        }

        System.out.print("<");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr2.get(i) + ", ");
        }
        System.out.print(arr2.get(n - 1));
        System.out.print(">");

        // 1966번 프린터 큐 문제

        // 12852번 1로 만들기 2 문제
    }
}
