import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String key = scan.nextLine();
        int size = key.length();
        int answer = 0;

        while (size != 0) {
            switch (key.substring(0, 1)) {
                case "1":
                    answer += 2;
                    break;
                case "A":
                case "B":
                case "C":
                    answer += 3;
                    break;
                case "D":
                case "E":
                case "F":
                    answer += 4;
                    break;
                case "G":
                case "H":
                case "I":
                    answer += 5;
                    break;
                case "J":
                case "K":
                case "L":
                    answer += 6;
                    break;
                case "M":
                case "N":
                case "O":
                    answer += 7;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    answer += 8;
                    break;
                case "T":
                case "U":
                case "V":
                    answer += 9;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    answer += 10;
                    break;
                case "0":
                    answer += 11;
                    break;
            }
            key = key.substring(1, size);
            size--;
        }
        System.out.println(answer);
    }
}
