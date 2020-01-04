package tester;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int realx = x;
        int temp = 0;
        int count = 0;

        int[] divided = new int[1000000];
        for (int i = 0; i < 100; i++)
            divided[i] = 0;

        while (true) {
            if ((x % 3) == 0) {
                x = x / 3;
                divided[count] = 3;
                count++;
            } else if ((x % 2) == 0) {
                x = x / 2;
                divided[count] = 2;
                count++;
            } else if (x == 1) {
                break;
            } else {
                for (int i = temp; i < count; i++) {
                    x = x * divided[i];
                    divided[i] = 0;
                }
                divided[temp] = -1;
                x--;
                count = ++temp;
            }
        }
        System.out.println(count);
        System.out.print(realx + " ");
        for (int i = 0; i < count; i++) {
            if (divided[i] < 0)
                realx--;
            else {
                if (divided[i] == 2)
                    realx = realx / 2;
                else
                    realx = realx / 3;
            }
            if (i != count - 1)
                System.out.print(realx + " ");
            else
                System.out.print(realx);
        }

    }
}