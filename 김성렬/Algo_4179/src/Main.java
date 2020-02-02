import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static class Tint {
        int x;
        int y;

        public Tint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void set(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        char[][] map = new char[row][col];
        String line;

        LinkedList exitList = new LinkedList();
        Tint J = new Tint(0, 0);
        Tint F = new Tint(0, 0);

        for (int x = 0; x < row; x++) {
            line = input.next();
            for (int y = 0; y < col; y++) {
                map[x][y] = line.charAt(y);
                if (map[x][y] == 'J')
                    J.set(x, y);
                if (map[x][y] == 'F')
                    F.set(x, y);
                if (x == 0 || x == row || y == 0 || y == col)
                    if (map[x][y] == '.')
                        exitList.add(new Tint(x, y));
            }
        }

        LinkedList<Tint> Flame = new LinkedList<Tint>();
        Flame.add(F);

        LinkedList<Tint> Jihun = new LinkedList<Tint>();
        Jihun.add(J);

        int count = 0;
        while (!Jihun.isEmpty()) {
            for (int i = 0; i < Jihun.size(); i++) {
                Tint temp = Jihun.poll();
                map[temp.x][temp.y] = '.';
                if (temp.x - 1 != -1) {
                    if (map[temp.x - 1][temp.y] == '.') {
                        map[temp.x - 1][temp.y] = 'J';
                        Jihun.add(new Tint(temp.x - 1, temp.y));
                    }
                }
                if (temp.x + 1 != row) {
                    if (map[temp.x + 1][temp.y] == '.') {
                        map[temp.x + 1][temp.y] = 'J';
                        Jihun.add(new Tint(temp.x + 1, temp.y));
                    }
                }
                if (temp.y - 1 != -1) {
                    if (map[temp.x][temp.y - 1] == '.') {
                        map[temp.x][temp.y - 1] = 'J';
                        Jihun.add(new Tint(temp.x, temp.y - 1));
                    }
                }
                if (temp.y + 1 != col) {
                    if (map[temp.x][temp.y + 1] == '.') {
                        map[temp.x][temp.y + 1] = 'J';
                        Jihun.add(new Tint(temp.x, temp.y + 1));
                    }
                }
            }
            for (int i = 0; i < Flame.size(); i++) {
                Tint temp = Flame.get(i);
                if (temp.x - 1 != -1) {
                    if (map[temp.x - 1][temp.y] != '#') {
                        if (map[temp.x - 1][temp.y] == 'J')
                            Jihun.remove(Jihun.indexOf(new Tint(temp.x - 1, temp.y)));
                        map[temp.x - 1][temp.y] = 'F';
                        Flame.add(new Tint(temp.x - 1, temp.y));
                    }
                }
                if (temp.x + 1 != row) {
                    if (map[temp.x + 1][temp.y] != '#') {
                        if (map[temp.x + 1][temp.y] == 'J')
                            Jihun.remove(Jihun.indexOf(new Tint(temp.x + 1, temp.y)));
                        map[temp.x + 1][temp.y] = 'F';
                        Flame.add(new Tint(temp.x + 1, temp.y));
                    }
                }
                if (temp.y - 1 != -1) {
                    if (map[temp.x][temp.y - 1] != '#') {
                        if (map[temp.x][temp.y - 1] == 'J')
                            Jihun.remove(Jihun.indexOf(new Tint(temp.x, temp.y - 1)));
                        map[temp.x][temp.y - 1] = 'F';
                        Flame.add(new Tint(temp.x, temp.y - 1));
                    }
                }
                if (temp.y + 1 != col) {
                    if (map[temp.x][temp.y + 1] != '#') {
                        if (map[temp.x][temp.y + 1] == 'J')
                            Jihun.remove(Jihun.indexOf(new Tint(temp.x, temp.y + 1)));
                        map[temp.x][temp.y + 1] = 'F';
                        Flame.add(new Tint(temp.x, temp.y + 1));
                    }
                }

            }
            if (Jihun.isEmpty()) {
                count = 0;
                break;
            }
            count++;
        }
        if (count == 0) {
            System.out.println("IMPOSSIBLE");
        } else
            System.out.println(count);

    }
}
