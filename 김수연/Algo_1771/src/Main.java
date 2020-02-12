import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++)
            answer.add(scan.nextInt());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            int temp1 = answer.get(i);
            int temp2 = answer.get(i+1);

            if (temp1 - temp2 == 1) {
                if (!list.contains(temp1))
                    list.add(temp1);
                if (!list.contains(temp2))
                    list.add(temp2);
            }
        }
    }
}