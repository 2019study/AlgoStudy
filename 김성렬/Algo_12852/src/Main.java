import java.util.*;

public class Main {
    public static class tree {
        int _me;
        int _stage;
        tree _head;
        tree one;
        tree two;
        tree three;

        public tree(int me, tree head) {
            this._me = me;
            this._head = head;
            if (this._head == null)
                this._stage = 0;
            else
                this._stage = this._head._stage+1;
        }

        public void makeTree() {
            if ((this._me - 1) >= 1) {
                this.one = new tree(this._me - 1, this);
                makeList.add(this.one);
            }
            if ((this._me % 2) == 0) {
                this.two = new tree(this._me / 2, this);
                makeList.add(this.two);
            }
            if ((this._me % 3) == 0) {
                this.three = new tree(this._me / 3, this);
                makeList.add(this.three);
            }

        }
    }
    static Queue<tree> makeList = new LinkedList<tree>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        tree t = new tree(x, null);
        makeList.add(t);
        while (makeList.peek()._me != 1) {
            makeList.poll().makeTree();
        }

        tree ans = makeList.poll();
        System.out.println(ans._stage);                   // total operators
        Stack<Integer> answer = new Stack<Integer>();
        while (ans._head != null) {
            answer.add(ans._me);
            ans = ans._head;
        }
        answer.add(ans._me);
        while(!answer.empty()){
            int Answer = answer.pop();
            if(Answer != 1)
                System.out.print (Answer+ " ");
            else
                System.out.println(Answer);
        }
    }
}