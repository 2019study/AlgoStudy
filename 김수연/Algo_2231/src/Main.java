import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int intInput = Integer.parseInt(input);

        int count = intInput - input.length()*9;
        if (count < 0)
            count = 1;

        while (true) {
            if (calculate(count) == intInput) {
                System.out.println(count);
                break;
            } else if (count > intInput) {
                System.out.println(0);
                break;
            } else
                count++;
        }
    }

    private static int calculate(int temp) {
        String stringTemp = Integer.toString(temp);
        int size = stringTemp.length();
        int answer = Integer.parseInt(stringTemp);

        for (int i = 0; i < size; i++)
            answer += stringTemp.charAt(i) - '0';

        return answer;
    }
}
