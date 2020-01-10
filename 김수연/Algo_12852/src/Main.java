import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static class tree {
        private tree root;
        private tree left;
        private tree center;
        private tree right;
        private int data;

        private tree(int data) {
            this.root = null;
            this.left = null;
            this.center = null;
            this.right = null;
            this.data = data;
        }

        private tree makeLeftTree(int data) {
            tree leftT;
            if (data > 1)
                leftT = new tree(data - 1);
            else
                leftT = null;
            return leftT;
        }

        private tree makeCenterTree(int data) {
            tree centerT;
            if (data % 2 == 0)
                centerT = new tree(data / 2);
            else
                centerT = null;
            return centerT;
        }

        private tree makeRightTree(int data) {
            tree rightT;
            if (data % 3 == 0)
                rightT = new tree(data / 3);
            else
                rightT = null;
            return rightT;
        }

        private void connectLeftTree(tree left) {
            this.left = left;
            left.root = this;
        }

        private void connectCenterTree(tree center) {
            this.center = center;
            center.root = this;
        }

        private void connectRightTree(tree right) {
            this.right = right;
            right.root = this;
        }
    }

    public static void main(String[] args) throws IOException {
        // 12852번 1로 만들기 2 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        int N = Integer.parseInt(br.readLine());

        ArrayList<tree> arr = new ArrayList<tree>();

        tree tr = new tree(N);
        arr.add(tr);

        while (true) {
            tr = arr.get(0);
            int data = tr.data;

            tree leftT = tr.makeLeftTree(data);
            if (leftT != null) {
                arr.add(leftT);
                tr.connectLeftTree(leftT);
                if (leftT.data == 1)
                    break;
            }

            tree centerT = tr.makeCenterTree(data);
            if (centerT != null) {
                arr.add(centerT);
                tr.connectCenterTree(centerT);
                if (centerT.data == 1)
                    break;
            }

            tree rightT = tr.makeRightTree(data);
            if (rightT != null) {
                arr.add(rightT);
                tr.connectRightTree(rightT);
                if (rightT.data == 1)
                    break;
            }
            arr.remove(0);
        }

        ArrayList<Integer> path = new ArrayList<Integer>();

        path.add(1);
        for (tree t = tr; t.root != null; t = t.root)
            path.add(t.data);
        path.add(N);

        System.out.println(path.size() - 1);
        for (int i = path.size() - 1; i >= 0; i--)
            System.out.print(path.get(i) + " ");
    }
}