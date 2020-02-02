import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Stack passwd = new Stack();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        int L = input.nextInt();
        int C = input.nextInt();
        char[] pw = new char[C];
        for (int i = 0; i < C; i++)
            pw[i] = input.next().charAt(0);
        Arrays.sort(pw);
        recursivePrint(pw);
    }
    public static void recursivePrint(char[] pw){
        while()
        if(!passwd.isEmpty()){

        }
    }
}
