import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            answer.add(scan.nextInt());
        }

        Collections.sort(answer);

        for (int i = 0; i < n; i++)
            System.out.println(answer.get(i)) ;
    }
}