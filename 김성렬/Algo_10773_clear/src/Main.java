import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        Stack<Integer> ansS = new Stack();
        for (int i = 0; i < count; i++) {
            int x = input.nextInt();
            if (x == 0)
                ansS.pop();
            else
                ansS.push(x);
        }
        int answer = 0;
        while(!ansS.isEmpty())
            answer+=ansS.pop();
        System.out.println(answer);
    }
}
