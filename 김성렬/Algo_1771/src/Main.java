import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pack = input.nextInt();
        int[] packs = new int[pack];
        for (int i = 0; i < pack; i++)
            packs[i] = input.nextInt();

    }
}
