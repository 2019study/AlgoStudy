import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int temp = a * b * c;
        String temp2 = Integer.toString(temp);

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        for (int i = 0; i < temp2.length(); i++) {
            char temp3 = temp2.charAt(i);
            switch (temp3) {
                case '0':
                    zero++;
                    break;
                case '1':
                    one++;
                    break;
                case '2':
                    two++;
                    break;
                case '3':
                    three++;
                    break;
                case '4':
                    four++;
                    break;
                case '5':
                    five++;
                    break;
                case '6':
                    six++;
                    break;
                case '7':
                    seven++;
                    break;
                case '8':
                    eight++;
                    break;
                case '9':
                    nine++;
                    break;
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}