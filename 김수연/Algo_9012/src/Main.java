import java.util.ArrayList;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            list.add(scan.next());
        }

        for (int i = 0; i < input; i++) {
            String temp = list.get(i);
            int length = temp.length();

            int left = 0;
            int right = 0;

            for (int j = 0; j < length; j++) {
                char VPS = temp.charAt(j);
                if (VPS == '(')
                    left++;
                else
                    right++;

                if (left - right < 0)
                    break;
            }

            if (left == right)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}