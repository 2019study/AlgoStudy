import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        String[] temp2 = temp.split("");

        temp = "";

        int[] answer = new int[26];

        for (String s : temp2) {
            char ch = s.charAt(0);
            if (97 <= ch && ch <= 122)
                ch = (char)(ch - 32);

            answer[(ch - 65)]++;
        }

        int max = 0;

        for (int i = 0; i < 26; i++) {
            if (max < answer[i])
                max = answer[i];
        }

        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (max == answer[i])
                index.add(i);
        }

        if (index.size() != 1)
            System.out.println("?");
        else
            System.out.println((char)(index.get(0) + 65));
    }
}