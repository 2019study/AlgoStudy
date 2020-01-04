import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int time = input.nextInt();
        int[] howMany = new int[time];
        for (int i = 0; i < time; i++) {
            int N = input.nextInt();
            int me = input.nextInt();
            howMany[i] = solve(N, me);
        }
        for (int i = 0; i < time; i++) {
            System.out.println(howMany[i]);
        }
    }

    public static int solve(int N, int me) {
        Queue<document> problem = new LinkedList<document>();

        for (int i = 0; i < N; i++) {
            if (i != me)
                problem.add(new document(input.nextInt()));
            else
                problem.add(new document(input.nextInt()).setMe());
        }
        int flag = 1;

        while (!problem.isEmpty()) {
            document isMe = problem.poll();
            Iterator it = problem.iterator();
            while (it.hasNext()) {
                if (isMe.getPriority() < ((document) it.next()).getPriority()) {
                    problem.add(isMe);
                    break;
                }
            }
            if(it.hasNext() == false){
                if(isMe.getMe()==true)
                    return flag;
                else
                    flag++;
            }
        }
        return flag;

    }

    public static class document {
        private int _priority;
        private boolean _me = false;

        public document(int index) {
            this._priority = index;
            this._me = false;
        }

        public document setMe() {
            this._me = true;
            return this;
        }

        public boolean getMe() {
            return this._me;
        }

        public int getPriority() {
            return this._priority;
        }
    }
}