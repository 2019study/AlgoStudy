import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] callTime = new int[count];

        for (int i = 0; i < count; i++) {
            callTime[i] = input.nextInt();
        }
        int mCharge = M(callTime);
        int yCharge = Y(callTime);
        if (mCharge == yCharge)
            System.out.println("Y M " + mCharge);
        else if (mCharge < yCharge)
            System.out.println("M " + mCharge);
        else
            System.out.println("Y " + yCharge);
    }

    public static int M(int[] callTime) {
        int charge = 0;
        float temp = 0;
        for (int i = 0; i < callTime.length; i++) {
            temp = callTime[i] / 60f;
            charge += (callTime[i] / 60 + 1) * 15;
        }
        return charge;
    }

    public static int Y(int[] callTime) {
        int charge = 0;
        for (int i = 0; i < callTime.length; i++)
            charge += (callTime[i] / 30 + 1) * 10;
        return charge;
    }
}
