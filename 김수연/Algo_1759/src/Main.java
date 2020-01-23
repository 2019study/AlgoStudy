import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int totalLength;
    private static int kinds;
    private static ArrayList<String> complete = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int c = scan.nextInt();

        totalLength = l;
        kinds = c;

        char[] list = new char[16];

        for (int i = 0; i < kinds; i++) {
            char temp = scan.next().charAt(0);
            list[i] = temp;
        }

        answer(list, "", 0, 0, 0);
        Collections.sort(complete);
        for (int i = 0; i < complete.size(); i++)
            System.out.println(complete.get(i));
    }

    private static void answer(char[] list, String answer, int pointer, int vowel, int consonant) {
        answer = answer.trim();
        if (answer.length() == totalLength) {
            if (vowel >= 1 && consonant >= 2) {
                char[] temp = answer.toCharArray();
                Arrays.sort(temp);
                answer = "";
                for (int i = 0; i < temp.length; i++)
                    answer += Character.toString(temp[i]);
                complete.add(answer);
            }
        } else {
            for (int i = pointer; i <= kinds; i++) {
                switch (list[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    answer(list, answer + list[i], i + 1, vowel + 1, consonant);
                    break;
                default:
                    answer(list, answer + list[i], i + 1, vowel, consonant + 1);
                    break;
                }
            }
        }
    }
}
