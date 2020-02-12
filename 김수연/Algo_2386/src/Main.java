import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char answer = scan.next().charAt(0);
        while(answer != '#') {
            String sentence = scan.nextLine();

            int count = 0;
            int index = -1;

            while ((index = sentence.indexOf(answer, index+1)) >= 0)
                count++;

            answer = (char)(answer - 32);

            while ((index = sentence.indexOf(answer, index+1)) >= 0)
                count++;

            answer = (char)(answer + 32);

            System.out.println(answer + " " + count);

            answer = scan.next().charAt(0);
        }
    }
}