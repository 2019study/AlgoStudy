import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.next();
        int time = 0;
        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);
            if (n == 'A' || n == 'B' || n == 'C') {
                time += 3;
            } else if (n == 'D' || n == 'E' || n == 'F') {
                time += 4;
            } else if (n == 'G' || n == 'H' || n == 'I') {
                time += 5;
            } else if (n == 'J' || n == 'K' || n == 'L') {
                time += 6;
            } else if (n == 'M' || n == 'N' || n == 'O') {
                time += 7;
            } else if (n == 'P' || n == 'Q' || n == 'R' || n == 'S') {
                time += 8;
            } else if (n == 'T' || n == 'U' || n == 'V') {
                time += 9;
            } else if (n == 'W' || n == 'X' || n == 'Y' || n == 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}

