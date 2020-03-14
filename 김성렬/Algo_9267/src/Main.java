import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static boolean ans = false;
    static LinkedList<Tint> list = new LinkedList<Tint>();

    public static class Tint {
        long a, b;

        public Tint(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long sum = input.nextLong();

        list.add(new Tint(a, b));
        while (!list.isEmpty()) {
            Tint me = list.poll();
            if (me.a == sum || me.b == sum)
                ans = true;
            else if (me.a + me.b <= sum) {
                list.add(new Tint(me.a, me.a + me.b));
                list.add(new Tint(me.a + me.b, me.b));
            }
        }
        if (ans == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
