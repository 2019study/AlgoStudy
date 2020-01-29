import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        char[][] maze = new char[x][y];

        for (int i = 0; i < x; i++) {
            String temp = scan.next();
            for (int j = 0; j < y; j++)
                maze[i][j] = temp.charAt(j);
        }
    }
}
