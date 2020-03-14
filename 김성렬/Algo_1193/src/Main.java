import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int thisNumber = input.nextInt();
        int count = 1;
        while (thisNumber > 0) {
            if (thisNumber - count > 0)
                thisNumber -= count;
            else
                break;
            count++;
        }

        if (count % 2 == 0) {
            System.out.println(thisNumber+"/"+(count-thisNumber+1));
        } else {
            System.out.println((count-thisNumber+1)+"/"+thisNumber);
        }
    }
}