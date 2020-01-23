import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int council = input.nextInt();
        ArrayList start = new ArrayList();
        ArrayList end = new ArrayList();
        for (int i = 0; i < council; i++) {
            start.add(input.nextInt());
            end.add(input.nextInt());
        }
        int[] ans = new int[council];

        for (int i = 0; i < council; i++) {
            int count = 1;
            Object startTime = start.get(i);
            Object endTime = end.get(i);

            if (start.contains(endTime)) {
                count++;


            }
        }
    }
}
