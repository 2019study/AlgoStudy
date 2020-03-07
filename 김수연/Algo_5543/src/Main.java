import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            temp.add(scan.nextInt());

        int temp1 = Collections.min(temp);
        temp.clear();

        for (int i = 0; i < 2; i++)
            temp.add(scan.nextInt());

        int temp2 = Collections.min(temp);

        System.out.println(temp1 + temp2 - 50);
    }
}