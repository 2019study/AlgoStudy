import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sum = input.nextDouble();

        if (checkOK(sum, a, b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean checkOK(double sum, double a, double b) {
        if (sum != 0) {
            if (a == 0 && b == 0)
                return false;
            else {
                if (a == 0) {
                    if (sum % b == 0)
                        return true;
                    else
                        return false;
                }
                if (b == 0) {
                    if (sum % a == 0)
                        return true;
                    else
                        return false;
                }
            }
            if ((sum % a == 0) || (sum % b == 0) || (sum % (a + b) == 0))
                return true;
            double time = (int) (sum / (a + b));
            for (double i = 1; i <= time; i++) {
                double tempsum = sum - (a + b) * i;
                if ((tempsum % a == 0) || (tempsum % b == 0) || (tempsum % (a + b) == 0))
                    return true;
            }
        }else if(a == 0 && b == 0 && sum == 0)
            return true;
        return false;
    }
}
