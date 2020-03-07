import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        String[] temp2 = temp.split("");
        Arrays.sort(temp2);

        temp = "";

        for (String s : temp2) {
            char ch = s.charAt(0);
            if (97 <= ch && ch <= 122)
                ch = (char)(ch - 32);
            temp += Character.toString(ch);
        }

        System.out.println(temp);
    }
}