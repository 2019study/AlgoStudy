import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 2309번 일곱 난쟁이 문제
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int totalSum = 0;

        for (int i = 0; i < 9; i++) {
            int height = scan.nextInt();
            arr.add(height);
            totalSum += height;
        }

        Collections.sort(arr);

        loop:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum == 100 + arr.get(i) + arr.get(j)) {
                    arr.remove(i);
                    arr.remove(j - 1);
                    break loop;
                }
            }
        }

        for (int i = 0; i < 7; i++)
            System.out.println(arr.get(i));
    }
}
