import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int count = 0;
        while (input.length() != 0) {
            if (input.length() == 1) {
                count++;
                break;
            }

            char first = input.charAt(0);
            char second = input.charAt(1);
            if (first == 'c') {
                if (second == '=' || second == '-') {
                    count++;
                    input = input.substring(2);
                } else {
                    count++;
                    input = input.substring(1);
                }
            }

            else if (first == 'd') {
                if (second == '-') {
                    count++;
                    input = input.substring(2);
                } else if (second == 'z') {
                    if (input.length() < 3) {
                        count++;
                        input = input.substring(1);
                    } else {
                        char third = input.charAt(2);
                        if (third == '=') {
                            count++;
                            input = input.substring(3);
                        } else {
                            count++;
                            input = input.substring(1);
                        }
                    }
                } else {
                    count++;
                    input = input.substring(1);
                }
            }

            else if (second == 'j') {
                if (first == 'l' || first == 'n') {
                    count++;
                    input = input.substring(2);
                } else {
                    count++;
                    input = input.substring(1);
                }
            }

            else if (second == '=') {
                if (first == 's' || first == 'z') {
                    count++;
                    input = input.substring(2);
                } else {
                    count++;
                    input = input.substring(1);
                }
            }

            else {
                count++;
                input = input.substring(1);
            }
        }

        System.out.println(count);
    }
}